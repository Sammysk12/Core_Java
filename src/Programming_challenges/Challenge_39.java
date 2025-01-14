package Programming_challenges;

public class Challenge_39 {
    public static void main(String[] args) {


        //Pattern 1
        int rows =5;
        for(int i = 0; i<rows; i++){
            for(int j= 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = rows; i>0; i--){
            for(int j = i ; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i = 0 ; i<rows; i++){
            for(int j = 0; j <rows-1-i; j++){
                System.out.print("  ");
            }
            for(int k = 0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
