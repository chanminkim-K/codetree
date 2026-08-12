import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX = 200;
    public static final int OFFSET = 100;
    public static int[][] board = new int[MAX][MAX];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) + OFFSET;
            int y = Integer.parseInt(st.nextToken()) + OFFSET;

            for(int j = x; j < x + 8; j++){
                for(int k = y; k < y + 8; k++)
                    board[j][k]++;
            }
        }

        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                if(board[i][j] >= 1)
                    answer++;
            }    
        }

        System.out.println(answer);
    }
}