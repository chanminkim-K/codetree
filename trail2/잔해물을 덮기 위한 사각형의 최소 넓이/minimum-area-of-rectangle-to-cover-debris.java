import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX = 2000;
    public static final int OFFSET = 1000;
    public static int[][] board = new int[MAX + 1][MAX + 1];

    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
       int[] x1 = new int[2];
       int[] y1 = new int[2];
       int[] x2 = new int[2];
       int[] y2 = new int[2];

       for(int i = 0; i < 2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            y1[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            x2[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            y2[i] = Integer.parseInt(st.nextToken()) + OFFSET;

            for(int j = x1[i]; j < x2[i]; j++){
                for(int k = y1[i]; k < y2[i]; k++){
                    board[j][k]++;
                }
            }
       }

        boolean found = false;
        int minX = MAX;
        int maxX = 0;
        int minY = MAX;
        int maxY = 0;

       for(int i = x1[0]; i < x2[0]; i++){
            for(int j = y1[0]; j < y2[0]; j++){
                if(board[i][j] == 1){
                    found = true;
                    
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
       }
        if(found)
            System.out.println((maxX - minX + 1) * (maxY - minY + 1));
        else
            System.out.println(0);
    }
}