
import java.util.Scanner;

public class HolidayOfEquality{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int[] arr = new int[n]; 
        for(int  i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++ ){
          max = Math.max(arr[i] , max);
        }

        for(int i = 0; i<n; i++){
            sum += (max - arr[i]);
        }

        System.out.println(sum);
    }
}