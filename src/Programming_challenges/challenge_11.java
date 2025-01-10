package Programming_challenges;

import java.util.Scanner;

public class challenge_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        System.out.println("Enter base of triangle: ");
        double base = sc.nextDouble();

        double area = 0.5*base*height;

        System.out.println("Area of triangle is "+ area);
    }
}
