import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX = 2000;
    public static final int OFFSET = 1000;
    public static boolean[][] board = new boolean[MAX + 1][MAX + 1];


    public static void board(int x1, int y1, int x2, int y2, int type){
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                if(type == 2)
                    board[i][j] = false;
                else    
                    board[i][j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x1, y1, x2, y2 = 0;
        int answer = 0;

        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            y2 = Integer.parseInt(st.nextToken()) + OFFSET;

            board(x1, y1, x2, y2, i);
        }

        for(int i = 0; i <= MAX; i++){
            for(int j = 0; j <= MAX; j++){
                if(board[i][j] == true)
                    answer++;
            }
        }

        System.out.println(answer);
    }
}