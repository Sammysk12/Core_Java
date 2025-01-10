package Programming_challenges;

import java.util.Scanner;

public class challenge_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        double mul = num1*num2;
        System.out.println("The multiplication is "+ mul);
    }
}
