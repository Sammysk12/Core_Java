package Programming_challenges;

import java.util.Scanner;

public class Challenge_31 {

    public static void printAllDigitSum(int num){

        int sum =0;
        while(num>0){



            int rem = num%10;
            sum+=rem;
            num = num/10;

        }

        System.out.println(sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        printAllDigitSum(num);

    }
}
