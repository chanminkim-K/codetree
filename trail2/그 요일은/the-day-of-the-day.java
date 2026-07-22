import java.util.Scanner;

public class Main {
    static int[] num_of_days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public static int cal(int m, int d){
        int result = 0;
        for(int i = 1; i < m; i++)
            result += num_of_days[i];
        return result + d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day = sc.next();

        String[] strArr = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int diff = cal(m2, d2) - cal(m1, d1);
        int wekend = diff / 7;
        int days = diff % 7;

        int answer = wekend;
        for(int i = 0; i < strArr.length; i++){
            if(day.equals(strArr[i]) && i <= days)
                answer++;
        }

        System.out.println(answer);
    }
}