import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int class_cnt = 0;
        int corridor_cnt = 0; 
        int restroom_cnt = 0;

        for(int i = 1; i <= n; i++){
            if(i % 12 == 0)
                restroom_cnt++;
            else if(i % 3 == 0)
                corridor_cnt++;
            else if(i % 2 == 0)
                class_cnt++;
        }

        System.out.printf(class_cnt + " " + corridor_cnt + " " + restroom_cnt + " ");

    }
}