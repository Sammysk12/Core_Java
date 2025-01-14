package Programming_challenges;

import Arrays.Array_2;

import java.util.Scanner;

public class Challenge_44 {

    public static int [] updatedArr(int arr[], int numToDelete){
        int occ = Challenge_41.checkCount(arr, numToDelete);
        if(occ == 0){
            return arr;
        }

        int newSize = arr.length -occ;
        int newArr[] = new int[newSize];

        int i = 0, j=0;
        while(i< arr.length){
            if(arr[i]!= numToDelete){
                newArr[j] = arr[i];
                j++;
            }
            i++;



        }

        return  newArr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();

        int arr [] = Array_2.takeInputArray(size);

        System.out.println("Enter number you want to delete: " );
        int numToDelete = sc.nextInt();

        int newArr [] = updatedArr(arr, numToDelete);

        Array_2.printArray(newArr);





    }


}
