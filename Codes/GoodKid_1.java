import java.util.*;
public class GoodKid_1{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i< t ;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0 ; j< n ; j++){
                arr[j] = sc.nextInt();
            }
            int minIndex = 0;
            for(int j = 0 ; j<n ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            arr[minIndex]++;

            long product  =1;
            for(int j= 0; j<n;j++){
                product *= arr[j];
            }
            System.out.println(product);


        }
    }
}