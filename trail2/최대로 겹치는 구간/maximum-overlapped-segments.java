import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[201];
        int offSet = 100;

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt() + offSet;
            int x2 = sc.nextInt() + offSet;

            for(int j = x1; j < x2; j++)
                arr[j]++;  
        }

        int max = 0;
        for(int i = 0; i <= 200; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}