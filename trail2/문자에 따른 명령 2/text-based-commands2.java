import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int cur_dir = 0;
        int cur_x = 0;
        int cur_y = 0;

        for(char dir : str.toCharArray()){
            if(dir == 'L') 
                cur_dir = (cur_dir - 1 + 4) % 4;
            else if(dir == 'R') 
                cur_dir = (cur_dir + 1) % 4;
            else if(dir == 'F'){
                cur_x += dx[cur_dir];
                cur_y += dy[cur_dir];
            }
        }
        System.out.println(cur_x + " " + cur_y);

    }
}