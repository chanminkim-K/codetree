import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        int[] arr1 = new int[N1];
        int[] arr2 = new int[N2];

        boolean checked = false;

        for(int i = 0; i < N1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < N2; i++){
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i <= N1 - N2; i++){
            if(arr2[0] == arr1[i]){
                checked = true;
                for(int j = 1; j < N2; j++){
                    if(arr1[i + j] != arr2[j]){
                        checked = false;
                        break;
                    }
                }
                
            }
        }

        if(checked){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    
    }
}