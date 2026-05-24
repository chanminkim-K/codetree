import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i = 1; i <= 9; i++){
            for(int j = B; j >= A; j -= 2){
                System.out.printf("%d * %d = %d", j, i, j * i);

                if(j > A)
                    System.out.printf(" / ");
            }
            System.out.println();
        }


    }
}