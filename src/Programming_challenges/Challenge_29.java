package Programming_challenges;

import java.util.Scanner;

public class Challenge_29 {

    public static int printOddSum(int num){

        int sum =0;
        for(int i = 0;i<=num;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();

        int sum = printOddSum(num);
        System.out.println("The sum of odd numbers upto "+num+" is "+sum);
    }
}
