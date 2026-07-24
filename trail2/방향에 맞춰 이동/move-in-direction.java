import java.io.*;
import java.util.*;

public class Main {

    public static int dir(char d){
        int result = 0;
        if(d == 'W') result = 0;
        else if(d == 'S') result = 1;
        else if(d == 'N') result = 2;
        else if(d == 'E') result = 3;
        return result;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dx = new int[]{-1, 0, 0, 1};
        int[] dy = new int[]{0, -1, 1, 0};


        StringTokenizer st;
        int cur_x = 0;
        int cur_y = 0;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            char x = st.nextToken().charAt(0);
            int y = Integer.parseInt(st.nextToken());

            int next_dir = dir(x);
            for(int j = 0; j < y; j++){
                cur_x += dx[next_dir];
                cur_y += dy[next_dir];    
            }
        }
        System.out.println(cur_x + " " + cur_y);

    }
}