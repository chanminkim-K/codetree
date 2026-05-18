import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n == 1){
            System.out.println("N");
            return;
        }

        int sum = 1;

        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                sum += i;
                if(i != n / i)
                    sum += n / i;
            }

            if(sum >= n)
                break;
        }

        if(sum == n)
            System.out.println("P");
        else
            System.out.println("N");
    }
}