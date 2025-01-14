package Functions;

import java.util.Scanner;

public class Function_3 {


    public static int calSum(int num1, int num2){
        return num1+num2;
    }

    public static int readvalue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int num1 = sc.nextInt();

        return num1;
    }


    public static void main(String[] args) {

        int num1 = readvalue();
        int num2 = readvalue();
        int sum = calSum(num1,num2);
        System.out.println("addition is "+sum);
    }
}
