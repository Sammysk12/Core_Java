package Programming_challenges;

import java.util.Scanner;

public class Challenge_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter % Marks: ");
        float percent = sc.nextFloat();


        if (percent >= 90) {
            System.out.println("Grade: A");
        } else if (percent <= 89 && percent >= 75) {
            System.out.println("Grade: B");
        } else if (percent <= 74 && percent >= 60) {
            System.out.println("Grade: C");
        } else if (percent <= 59 && percent >= 30) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
