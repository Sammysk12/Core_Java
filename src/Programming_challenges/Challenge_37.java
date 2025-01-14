package Programming_challenges;

import java.util.Scanner;

public class Challenge_37 {

    public static void checkArmstrong(int num){

        if(num<0) return;

        int temp = num;
        int rem =0;
        int arm = 0;
       while(num>0){

            rem = num%10;
            arm += rem*rem*rem;
            num/=10;
        }

        if(temp==arm){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        checkArmstrong(num);
    }
}
