package Programming_challenges.challenge_2;

import java.util.Scanner;

public class PRintSumOf2Nums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("The sum is "+ (num1+num2));
    }
}
