package Programming_challenges;

import java.util.Scanner;

public class Challenge_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1= sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter number 3: ");
        int num3 = sc.nextInt();

        if(num1>=num2){
            if(num1>=num3){
                System.out.println(num1+ " is greater");
            }else{
                System.out.println(num3+" is greater");
            }
        }else if(num2>=num1){
            if(num2>=num3){
                System.out.println(num2+ " is greater");
            }else {
                System.out.println(num3+ " is greater");
            }
        }
    }
}
