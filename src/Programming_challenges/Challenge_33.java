package Programming_challenges;

import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Challenge_33 {

    public static int least(int num1, int num2){
        if(num1<num2){
            return num2;
        }else {
            return num1;
        }
    }



    public static int printGcd(int num1, int num2, int least) {
        int gcd = 1;
        for(int i=2; i<=least;i++){

            if(num1%i==0&&num2%i ==0){
                gcd = i;
                return gcd;
            }

        }

        return gcd;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        int least = least(num1, num2);

        int gcd = printGcd(num1, num2, least);
        System.out.println("GCD is "+gcd);
    }
}
