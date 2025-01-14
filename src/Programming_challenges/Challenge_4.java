package Programming_challenges;

import java.util.Scanner;

public class Challenge_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 1 number: ");
        int a = sc.nextInt();
        System.out.println("Please enter 2 number: ");
        int b = sc.nextInt();

        System.out.println("Addition is "+ a+b);
        System.out.println("Subtraction is "+ (a-b));
        System.out.println("Multiplication is "+ a*b);
        System.out.println("Division is "+ a/b);
        System.out.println("Remainder is "+ a%b);
    }
}
