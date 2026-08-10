import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[201][201];
        int answer = 0;
        int overlap = 0;

        for(int i = 0; i < n; i++){
            int x1, x2, y1, y2 = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken()) + 100;
            y1 = Integer.parseInt(st.nextToken()) + 100;
            x2 = Integer.parseInt(st.nextToken()) + 100;
            y2 = Integer.parseInt(st.nextToken()) + 100;
            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    arr[j][k]++;
                }
            }
        }

        for(int i = 0; i <= 200; i++){
            for(int j = 0; j <= 200; j++){
                if(arr[i][j] >= 1)
                    answer++;
            }
        }

        System.out.println(answer);
    }
}