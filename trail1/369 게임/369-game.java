import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            String strNum = String.valueOf(i);
            if(i % 3 == 0 || strNum.contains("3") || strNum.contains("6") || strNum.contains("9"))
                System.out.printf("0 ");
            else
                System.out.printf(i + " ");
        }
    }
}