import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N + 1];

        for(int i = 1; i <= N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i <= Q; i++){
            int quesNum = sc.nextInt();
            int first = sc.nextInt();

            if(quesNum == 1){
                System.out.println(arr[first]);
            }
            else if(quesNum == 2){
                boolean check = false;

                for(int j = 1; j <= N; j++){
                    if(arr[j] == first){
                        System.out.println(j);
                        check = true;
                        break;
                    }
                }
                if(!check){
                    System.out.println(0);
                }
            }
            else if(quesNum == 3){
                int second = sc.nextInt();
                for(int j = first; j <= second; j++){
                    System.out.printf(arr[j] + " ");
                }
                System.out.println();
            }

        }
        
    }
}