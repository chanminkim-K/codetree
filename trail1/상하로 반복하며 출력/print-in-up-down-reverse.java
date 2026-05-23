import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(j % 2 == 0)
                    System.out.print(i + 1);
                else
                    System.out.print(N - i);
            }
            System.out.println();
        }
    }
}