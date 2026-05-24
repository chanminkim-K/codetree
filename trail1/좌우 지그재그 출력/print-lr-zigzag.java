import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            if(i % 2 == 0){
                for(int j = N * i + 1; j <= N * (i + 1); j++)
                    System.out.printf(j + " ");
            }
            else{
                for(int j = N * (i + 1); j > N * i; j--)
                    System.out.printf(j + " ");
            }
            System.out.println();
        }

        
    }
}