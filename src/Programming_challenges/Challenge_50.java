package Programming_challenges;

import Arrays.Array_2D;

import java.util.Scanner;
import java.util.SequencedSet;

public class Challenge_50 {

    public static long sumOfDiagonals(int arr[][]){
        long leftDiasum = sumOfLeftDia(arr);
        long rightDiaDum =sumOfRightDia(arr);
        long sum = leftDiasum+rightDiaDum;
        if(arr.length % 2!=0){
            int ind = arr.length/2;
            sum-= arr[ind][ind];
        }


        return sum;
    }

    public static long sumOfLeftDia(int arr[][]){
    long sum = 0;
    for(int i =0 ; i< arr.length; i++){
        sum+=arr[i][i];
    }
    return sum;
    }

    public static long sumOfRightDia(int arr[][]){
        long sum =0;
        int i= 0;
        while(i< arr.length){
            int col = arr.length -1- i;
            sum+=arr[i][col];
            i++;
        }
        return sum;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row number: ");
        int row = sc.nextInt();

        System.out.println("Enter column number: ");
        int cols = sc.nextInt();

        int arr[][]= Array_2D.take2DInput(row,cols);

        long sum = sumOfDiagonals(arr);
        System.out.println("The sum is "+sum);
    }
}
