import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int lastIndex = 10;
        int sum = 0;
        double avg = 0.0;

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            if(num >= 250){
                lastIndex = i;
                break;
            }
                
            arr[i] = num;
        }

        for(int i = 0; i < lastIndex; i++){
            sum += arr[i];
        }
        avg = (double)sum / (lastIndex);

        System.out.printf("%d %.1f", sum, avg);
        
    }
}