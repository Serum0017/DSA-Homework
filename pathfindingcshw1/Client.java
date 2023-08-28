import java.util.Scanner;
import java.util.Random;

public class Client {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int trials = scan.nextInt();

        Random rand = new Random();

        for(int j = 3; j < 7; j++){
            System.out.println("Trialing number of array elements = 10^" + j);
            for(int k = 0; k < trials; k++){
                int len = (int) Math.pow(10, j);
                int[] arr1 = new int[len];
                for(int i = 0; i < len; i++){
                    arr1[i] = rand.nextInt(100000, 1000000);
                }
                int[] arr2 = new int[len];
                for(int i = 0; i < len; i++){
                    arr2[i] = rand.nextInt(100000, 1000000);
                }

                for(int i = 0; i < arr1.length; i++){
                    int val = arr1[i];
                    boolean isFound = BinarySearch.search(0, len-1, val, arr2) != -1;
                    if(isFound == true){
                        System.out.println("value " + val + " found in both arrays!");
                    }
                }
            }
        }
    }
}
