import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numArr = new int[N];

        for(int i = 0; i < N; i++)
            numArr[i] = sc.nextInt();
        
        Arrays.sort(numArr);

        System.out.printf(numArr[N - 1] + " " + numArr[N - 2]);
        
    }
}