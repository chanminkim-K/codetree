import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                int col = (i % 2 == 0) ? j : (N - 1 - j);

                int num = i * N + col + 1;
                System.out.printf(num + " ");
            }
            System.out.println();
        }

        
    }
}