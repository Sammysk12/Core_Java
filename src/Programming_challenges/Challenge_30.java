package Programming_challenges;

import java.util.Scanner;

public class Challenge_30 {

    public  static long calFactorial(long num){
        long fact =1;

        for(int i =1; i<=num; i++){
            fact*=i;
        }


        return fact;
    }



    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        long num = sc.nextLong();

        long fact = calFactorial(num);
        System.out.println("The factorial of "+num+" is "+fact);


    }
}
