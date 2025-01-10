package Programming_challenges.challenge_3;

import java.util.Scanner;

public class Swap2Numbers {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = sc.nextInt();

        System.out.println("Enter number 2: ");
        int b = sc.nextInt();


        //swaping algorithm
        int c = a;
        a = b;
        b = c;

        System.out.println("Value of a is " +a);
        System.out.println("Value of b " +b);
    }
}
