import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[1001];
        int max = 0;
        int answer = -1;

        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            arr[num]++;
            if(num > max){
                max = num;
            }
        }

        for(int i = max; i > 0; i--){
            if(arr[i] == 1){
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    }
}