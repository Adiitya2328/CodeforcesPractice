import  java.util.*;
public class ArrivalOfTheGeneral{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = -1;
        int min  = 101;

        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 0 ; i<n ;i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        int swap = maxIndex + (n-1-minIndex);
        if(maxIndex>minIndex){
            swap--;
        }

        System.out.println(swap);
    }
}