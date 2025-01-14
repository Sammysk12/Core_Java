package Programming_challenges;

import java.util.Scanner;

public class Challenge_38 {
    public static void checkPallindrome(int num){
        int rev = 0;
        int temp = num;
        while (num>0){
            int digit = num%10;
            rev= rev*10+digit;
            num/=10;

        }
        if (temp == rev){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        checkPallindrome(num);
    }
}
