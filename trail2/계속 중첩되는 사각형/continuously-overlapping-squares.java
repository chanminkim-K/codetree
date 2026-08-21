import java.util.Scanner;
public class Main {
    public static final int MAX = 200;
    public static final int OFFSET = 100;
    public static int[][] board = new int[MAX + 1][MAX + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    if(i % 2 == 0)
                        board[j][k] = 1;
                    else
                        board[j][k] = 2;
                }
                
            }
        }
        for(int i = 0; i <= MAX; i++){
            for(int j = 0; j <= MAX; j++){
                if(board[i][j] == 2)
                    answer++;
            }
        }
        System.out.println(answer);
    }
}