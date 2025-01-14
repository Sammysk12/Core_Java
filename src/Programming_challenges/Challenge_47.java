package Programming_challenges;

import Arrays.Array_2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Challenge_47 {

    public static int [] mergerTwoArrays(int arr1[], int arr2[]){
        int mergedSize = arr1.length + arr2.length;
        int mergerdArray[] =new int[mergedSize];

        int i = 0, j=0,k=0;
        while(i<arr1.length || j< arr2.length){
            if(j == arr2.length || (i< arr1.length && arr1[i]< arr2[j])){
                mergerdArray[k] = arr1[i];
                i++;
                k++;
            }
            else{
                mergerdArray[k] = arr2[j];
                j++;
                k++;
            }

        }


        return mergerdArray;
    }


    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter size 1: ");
        int size1 = sc.nextInt();

        System.out.println("Enter size 2: ");
        int size2 =sc.nextInt();

        int arr1[] = Array_2.takeInputArray(size1);
        int arr2[] = Array_2.takeInputArray(size2);


        int mergedArr[]= mergerTwoArrays(arr1, arr2);

        Array_2.printArray(mergedArr);

    }
}
