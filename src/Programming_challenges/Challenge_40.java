package Programming_challenges;

public class Challenge_40 {

    public static void printArrSum(int [] arr){
        int sum =0;

        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    }


    public static void main(String[] args) {

        int arr [] = {4,3,5,3,1};

        printArrSum(arr);

    }
}
