package Programming_challenges;

import Arrays.Array_2;

import java.util.Scanner;

public class Challenge_46 {

    public static void checkPallindrome(int arr[]){

        boolean isPallindrome =true;
        for(int i = 0 ; i< arr.length/2 ; i++) {
            if(arr[i] != arr[arr.length - i - 1]){
                isPallindrome = false;
            }
        }
        if(isPallindrome){
            System.out.println("Pallindrome array");
        }else{
            System.out.println("Not pallindrome array");
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

       int arr[] = Array_2.takeInputArray(size);

        checkPallindrome(arr);


    }

}
