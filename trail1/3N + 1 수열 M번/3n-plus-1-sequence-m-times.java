import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        for(int i = 0; i < M; i++){
            int N = sc.nextInt();
            int cnt = 0;

            while(N != 1){
                if(N % 2 == 0)
                    N /= 2;
                else
                    N = N * 3 + 1;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}