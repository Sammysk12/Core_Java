package Programming_challenges;

import java.util.Scanner;

public class challenge_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side 1: ");
        double s1=sc.nextDouble();
        System.out.println("Enter side 2: ");
        double s2=sc.nextDouble();
        System.out.println("Enter side 3: ");
        double s3=sc.nextDouble();
        System.out.println("Enter side 4: ");
        double s4=sc.nextDouble();

        double peri = s1+s2+s3+s4;

        System.out.println("The perimeter is "+ peri+ " cm");


    }
}
