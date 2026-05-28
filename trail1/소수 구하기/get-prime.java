import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 2; i <= N; i++){
            boolean check = false;

            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    check = true;
                    break;
                }
            }
            
            if(!check){
                System.out.printf(i + " ");
            }
            
        }
    }
}
