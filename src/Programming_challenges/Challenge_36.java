package Programming_challenges;

import java.util.Scanner;

public class Challenge_36 {

    public static void printFibo(int num){
        int firstNum = 0;
        int secondNum = 1;
        if(num<0) return;
        if(num == 0) System.out.println(num);
        while(firstNum+secondNum <=num){
            int third = firstNum+secondNum;
            System.out.println(third);
            firstNum =secondNum;
            secondNum = third;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        printFibo(num);
    }
}
