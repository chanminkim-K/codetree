import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        int ans_cnt = 0;

        for(int i = start; i <= end; i++){
            int cnt = 2;
            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0) cnt++;
    
                if(cnt > 3) break;
            }
            if(cnt == 3) ans_cnt++;
        }
        System.out.println(ans_cnt);
    }
}