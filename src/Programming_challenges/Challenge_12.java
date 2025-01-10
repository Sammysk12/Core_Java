package Programming_challenges;

import java.util.Scanner;

public class Challenge_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calulate Simple interest Calculator");
        System.out.print("Enter your Principle amount : ");
        int principleAmount = sc.nextInt();

        System.out.println("Enter your rate of interest: ");
        float rateOfInterest = sc.nextFloat();

        System.out.println("For how many years: ");
        float years = sc.nextFloat();

        float interest = (principleAmount*rateOfInterest*years) / 100;

        System.out.println("The interest is "+ interest);

    }
}
