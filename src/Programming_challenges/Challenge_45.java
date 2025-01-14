package Programming_challenges;

import Arrays.Array_2;

import java.util.Scanner;

public class Challenge_45 {

    public static void swapArray(int arr[]){

        for(int i = 0 ; i< arr.length/2 ; i++) {
            int swap = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = swap;
        }

        Array_2.printArray(arr);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();

        int arr [] = Array_2.takeInputArray(size);

        System.out.println("Original array: ");
        Array_2.printArray(arr);

        System.out.println();
        System.out.println("Reversed Array: ");
        swapArray(arr);



    }
}
