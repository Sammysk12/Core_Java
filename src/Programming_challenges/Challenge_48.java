package Programming_challenges;

import Arrays.Array_2D;

import java.util.Scanner;

public class Challenge_48 {

    public static void search2DArray(int arr[][],int find){

        boolean isFound = false;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
            if(arr[i][j] == find){
                isFound =true;
            }
            }

        }
        if(isFound){
            System.out.println("Number found");

        }else {
            System.out.println("Number Not Found!");
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int row = sc.nextInt();
        System.out.println("Enter column number: ");
        int cols= sc.nextInt();
        int arr[][] = Array_2D.take2DInput(row, cols);

        System.out.println("Enter number to find :");
        int find = sc.nextInt();
        search2DArray(arr, find);
    }
}
