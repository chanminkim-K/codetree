import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX_RANGE = 100;
    public static int n = MAX_RANGE;
    public static int m = MAX_RANGE;
    public static int x = 0;
    public static int y = 0;
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int dirNum = 0;

    public static boolean inRange(int x, int y){
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] answer = new int[n+1][m+1];
        int start_num = 65;
        answer[x][y] = start_num;
        for(int i = 2; i <= n * m; i++){
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if(!inRange(nx, ny) || answer[nx][ny] != 0)
                dirNum = (dirNum + 1) % 4;
            
            x = x + dx[dirNum];
            y = y + dy[dirNum];
            
            if(++start_num > 90)
                start_num = 65;

            answer[x][y] = start_num;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print((char)(answer[i][j]) + " ");
            System.out.println();
        }

        


    }
}