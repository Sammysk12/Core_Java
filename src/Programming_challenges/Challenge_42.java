package Programming_challenges;

import Arrays.Array_1;
import Arrays.Array_2;

import java.util.Scanner;

public class Challenge_42 {

    public static int findMax(int []arr){
        int max = Integer.MIN_VALUE;
        if(arr.length == 0) return 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] >=max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int []arr){
        int min = Integer.MAX_VALUE;
        if(arr.length == 0) return 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] <=min){
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr [] = Array_2.takeInputArray(size);

        int max= findMax(arr);
        int min = findMin(arr);



        System.out.println("The max value is : "+max);
        System.out.println("The min value is : "+min);


    }
}
