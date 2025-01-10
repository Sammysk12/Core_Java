package Operators;

import org.w3c.dom.ls.LSOutput;

public class Arithmatic_Operator {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


        double x = 5;
        double y = 2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);


        System.out.println(9/3*2/6);
        //  ====> If precendence is same then performs in left to right action =>

        System.out.println(9/(3/3));
        //If bracket is there then is gets executed first
    }
}
