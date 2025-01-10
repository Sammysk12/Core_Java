package Programming_challenges;

import java.util.Scanner;

public class Challenge_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Temperature sensor");
        System.out.println("Enter degree F: ");
        float faren = sc.nextFloat();


        float celcius = (faren -32)*5/9;

        System.out.println("The temperature in degree celcius is : "+celcius);
    }
}
