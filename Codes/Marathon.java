import java.util.*;
public class Marathon{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[4];
        
        for(int i = 0 ; i <t ;i++){
            int count = 0;
            for(int j = 0 ; j< 4 ;j++ ){
                arr[j] = sc.nextInt();
            }
            int comp = arr[0];

            for(int j = 0; j< 4 ; j++){
                if(arr[j] > comp){
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}