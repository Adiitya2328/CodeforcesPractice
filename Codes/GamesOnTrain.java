import java.util.*;
public class GamesOnTrain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int mx = Integer.MIN_VALUE;
            int mn = Integer.MAX_VALUE;
            for(int i = 0 ; i<n; i++){
                int h =sc.nextInt();
                if(h<mn){
                    mn = h;
                }if(h>mx){
                    mx =h;
                }

            }
            int k = mx -mn+1;
            System.out.println(k);
        }
    }
}