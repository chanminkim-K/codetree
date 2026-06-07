import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int INT_MAX = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int min = INT_MAX;
        int[] arr = new int[N];
        int cnt = 0;
        
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < min){
                min = arr[i];
            }
        }

        for(int i = 0; i < N; i++){
            if(arr[i] == min){
                cnt++;
            }
        }

        System.out.printf(min + " " + cnt);

    }
}