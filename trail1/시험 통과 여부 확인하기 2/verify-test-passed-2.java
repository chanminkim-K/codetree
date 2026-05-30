import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 0;

        for(int i = 0; i < N; i++){

            double avg = 0.0;
            for(int j = 0; j < 4; j++){
                avg += sc.nextDouble();
            }
            avg /= 4;

            if(avg >= 60){
                System.out.println("pass");
                cnt++;
            }
            else{
                System.out.println("fail");
            }
        }
        System.out.println(cnt);

    }
}