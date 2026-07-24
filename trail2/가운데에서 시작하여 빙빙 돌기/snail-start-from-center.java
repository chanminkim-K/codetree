import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX_NUM = 100;
    public static int n = MAX_NUM;



    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[][] answer = new int[n+1][n+1];
        int[] dr = new int[]{0, -1, 0, 1};
        int[] dc = new int[]{1, 0, -1, 0};
        int x = n / 2;
        int y = n / 2;
        int dir_num = 0;
        
        int step = 1;
        int start = 1;
        int max = n * n;
        answer[x][y] = start;
        while(start < max){
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < step; j++){
                    if(start == max) break;
                    x += dr[dir_num];
                    y += dc[dir_num];
                    start++;
                    answer[x][y] = start;
                }
                dir_num = (dir_num + 1) % 4;
            }
            step++;
        }

       
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.printf(answer[i][j] + " ");
            System.out.println();
        }



        

    }
}