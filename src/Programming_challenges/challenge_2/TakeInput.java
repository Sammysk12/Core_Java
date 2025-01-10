package Programming_challenges.challenge_2;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.next();

        System.out.println("Welcome to coding world! " + name);
    }
}
