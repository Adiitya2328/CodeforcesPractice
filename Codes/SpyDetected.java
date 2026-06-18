
import java.util.Scanner;

public class SpyDetected{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = -1;
        while(t--> 0){
            int l = sc.nextInt();
            int[] arr = new int[l];
            for(int i = 0 ; i< l ;i++){
                arr[i] = sc.nextInt();
            }
            if(arr[0] != arr[1]){
                if(arr[0] == arr[2]){
                    ans = 1;
                }else{
                    ans = 0;
                }
            }else{
                for(int i = 2 ;i<l;i++ ){
                    if(arr[i] != arr[0]){
                        ans = i;
                        break;
                    }
                }
            }
            System.out.println(ans+1);
        }
        
    }
}