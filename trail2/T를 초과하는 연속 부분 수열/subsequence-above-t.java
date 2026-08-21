import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int answer = 0, cnt = 0;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            if(i >= 1 && arr[i - 1] > t && arr[i] > t)
                cnt++;
            else if(arr[i] > t)
                cnt = 1;
            else
                cnt = 0; 
            
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
}