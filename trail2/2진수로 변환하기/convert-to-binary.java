import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        while(true){
            if(n < 2){
                sb.append(n);
                break;
            }
            sb.append(n % 2);
            n /= 2;
        }

        System.out.println(sb.reverse());
    }
}