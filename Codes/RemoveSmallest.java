import java.util.*;
public class RemoveSmallest{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test = 0 ; test < t; test++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i< n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean possible = true;
            for(int i = 1 ; i< n; i++){
                if(arr[i] - arr[i-1] > 1){
                    possible = false;
                }
            }
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
    }
}