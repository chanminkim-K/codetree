import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int min = 999;
        int max = -999;
        while(true){
            num = sc.nextInt();

            if(num == -999 || num == 999){
                break;
            }

            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        
        System.out.printf(max + " " + min);
    }
}