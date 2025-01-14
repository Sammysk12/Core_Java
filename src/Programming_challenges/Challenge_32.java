package Programming_challenges;

import java.util.Scanner;

public class Challenge_32 {

    public static int printLcm(int num1, int num2){

        for (int i = 1;i<=num2; i++){
            int factor = num1*i;

            if(factor%num2 ==0){
                return factor;
            }

        }
        return 0;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        int lcm = printLcm(num1, num2);

        System.out.println("LCM is "+lcm);
    }
}
