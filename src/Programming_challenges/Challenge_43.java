package Programming_challenges;

import Arrays.Array_2;

import java.util.Scanner;

public class Challenge_43 {

    public static boolean checkSortedInc(int arr[]){

        boolean isSorted = true;

        for(int i = 1 ; i< arr.length; i++){
            if(arr[i] < arr[i-1]){
                isSorted = false;
                return isSorted;
            }
        }
        return isSorted;
    }
    public static boolean checkSortedDec(int arr[]){

        boolean isSorted = true;

        for(int i = 1 ; i< arr.length; i++){
            if (arr[i] > arr[i-1]) {
                isSorted = false;
                return isSorted;
            }
        }
        return isSorted;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] =Array_2.takeInputArray(size);

        boolean isSortedInc = checkSortedInc(arr);
        boolean isSortedDec = checkSortedDec(arr);

        if(isSortedInc || isSortedDec){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    }
}
