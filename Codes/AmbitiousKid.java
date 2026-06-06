
import java.util.Scanner;

public class AmbitiousKid{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i< n ;i++){
            int current = Math.abs(arr[i]);
            if(current < smallest){
                smallest = current;
            }
        }
       
        System.out.println(smallest);
    }
}