import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        int[] countArr = new int[10];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            countArr[arr[i]]++;
        }

        for(int i = 1; i < 10; i++){
            System.out.println(countArr[i]);
        }

      
    }
}