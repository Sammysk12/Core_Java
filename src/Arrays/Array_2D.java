package Arrays;

import java.util.Scanner;

public class Array_2D {

    public static int[][] take2DInput(int rows, int cols){
        Scanner sc = new Scanner(System.in);

        int arr [][]= new int[rows][cols];
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print("Enter "+"["+(i+1)+","+(j+1)+"] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }


    public static void print2DArray(int arr [][]){
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of Columns: ");
        int cols = sc.nextInt();



         take2DInput(rows,cols);




    }
}
