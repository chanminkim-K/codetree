import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clinic[] = new int[4];

        for(int i = 0; i < 3; i++){
            char cold = sc.next().charAt(0);
            int temp = sc.nextInt();

            if(cold == 'Y'){
                if(temp >= 37){
                    clinic[0]++;
                }
                else{
                    clinic[2]++;
                }
            }
            else{
                if(temp >= 37){
                    clinic[1]++;
                }
                else{
                    clinic[3]++;
                }
            }
        }

        for(int i = 0; i < 4; i++){
            System.out.printf(clinic[i] + " ");
        }
        if(clinic[0] >= 2){
            System.out.println("E");
        }


    }
}