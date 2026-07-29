import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[201];
        int answer = 0;
        int cur_x = 100;

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);

            for(int j = 0; j < x; j++){
                if(dir == 'R'){
                    arr[cur_x]++;
                    cur_x++;
                }
                else if(dir == 'L'){
                    cur_x--;
                    arr[cur_x]++;
                }
            }
        }

        for(int i = 0; i <= 200; i++){
            if(arr[i] >= 2)
                answer++;
        }

        System.out.println(answer);
    }
}