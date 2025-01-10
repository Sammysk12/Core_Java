package Variables;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        String name = sc.next();

        System.out.println("Good morning " + name);
        System.out.print(name + ", Also tell me your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is "+age);
    }
}
