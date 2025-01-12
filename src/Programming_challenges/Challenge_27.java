package Programming_challenges;

import java.util.Scanner;

public class Challenge_27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        if((num & 1) ==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

}
