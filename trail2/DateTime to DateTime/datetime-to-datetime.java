import java.util.Scanner;

public class Main {

    public static int cal(int d, int h, int m){
        return (d * 1440) + (h * 60) + m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = cal(a, b, c) - cal(11, 11, 11);
        if(result < 0)
            System.out.println(-1);
        else
            System.out.println(cal(a, b, c) - cal(11, 11, 11));
    }
}