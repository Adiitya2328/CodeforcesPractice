import java.util.*;
public class BlankSpace{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int t = sc.nextInt();
        
        for(int i = 0 ; i < t ; i++){
            int n = sc.nextInt();
            int space = 0;
            int max = 0;
            int[] arr = new int[n];
            for(int j = 0; j<n ; j++){
                arr[j] = sc.nextInt();
            }
            for(int k = 0; k<n; k++){
                if(arr[k] == 0){
                    space++;
                    max = Math.max(max , space);
                }else {
                    space = 0;
                }

            }
            System.out.println(max);
        }
    }
}