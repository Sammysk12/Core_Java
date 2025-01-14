package Programming_challenges;

import java.util.Scanner;

public class Challenge_34 {

    public static void checkPrime(int num){

        boolean isPrime = true;

        for(int i =2; i<num; i++){
            if(num%i==0){
                isPrime =false;
            }
        }

        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Non-prime");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num =sc.nextInt();

        checkPrime(num);
    }
}
