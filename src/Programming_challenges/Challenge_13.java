package Programming_challenges;

import java.util.Scanner;

public class Challenge_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calulate Simple interest Calculator");
        System.out.print("Enter your Principle amount : ");
        int principleAmount = sc.nextInt();

        System.out.println("Enter your rate of interest: ");
        float rateOfInterest = sc.nextFloat();

        System.out.println("For how many years: ");
        float years = sc.nextFloat();

        double compoudInterest = principleAmount*Math.pow((1+rateOfInterest/100),years);

        System.out.println("The compound interest is: "+compoudInterest);
    }
}
