package Programming_challenges;


import Arrays.Array_2D;

import java.util.Scanner;

public class Challenge_49 {


    public static int calculateSum(int arr[][]){

        int sum= 0;
        if(arr.length < 0) return 0;
        for(int i = 0; i< arr.length; i++){
            for(int j =0; j<arr[i].length; j++){

                sum+=arr[i][j];
            }
        }
        return sum;
    }


    public static double calculateAverage(int arr[][], int row , int cols){
        int sum = calculateSum(arr);

        double size = row*cols;

        double average = sum/size;
        return average;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row number: ");
        int row = sc.nextInt();

        System.out.println("Enter column number: ");
        int cols = sc.nextInt();

        int arr[][] = Array_2D.take2DInput(row,cols);

        int sum = calculateSum(arr);
        double average = calculateAverage(arr,row,cols);

        System.out.println("The sum is : "+sum);
        System.out.println("The average is: "+average);
    }
}
