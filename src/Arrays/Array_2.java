package Arrays;


import java.util.Scanner;

public class Array_2 {

    public static int[] takeInputArray(int size){
        Scanner sc =new Scanner(System.in);
        int arr [] = new int[size];
        for(int i = 0 ; i< size; i++){
            System.out.print("Enter value "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int arr[]){
        for (int i = 0; i<arr.length; i++){

                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter how many: ");
        int size = sc.nextInt();
        int arr [] = takeInputArray(size);


        System.out.println("Enter which to find: ");
        int find = sc.nextInt();

        printArray(arr);


    }
}
