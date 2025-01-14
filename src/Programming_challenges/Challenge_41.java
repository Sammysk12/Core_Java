package Programming_challenges;


import java.util.Scanner;

public class Challenge_41 {

    public static int checkCount(int arr[], int num){

        int count =0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == num){
                count++;

            }
        }

        System.out.println("The total count of "+num +" is "+count);

        return count;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = {3,3,2,5,4,4,6,4,3,4,5,3,2,4,2,4,2,3,4,2,4,4,2,4,2,4,6,7,5,4,6};

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        checkCount(arr, num);

    }
}
