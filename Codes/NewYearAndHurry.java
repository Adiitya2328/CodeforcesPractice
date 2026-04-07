import java.util.*;
public class NewYearAndHurry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k  = sc.nextInt();
        int totaltime = 240;
        int time=0;
        int ans = 0; 
        for(int i =1; i<=n;i++){
            time = time + 5*i;
            int timel = totaltime - time;
            if(timel<k){
                 ans = i-1;
                break;
            }else{
                ans = n;
            }
            
        }
        System.out.println(ans);
    }
}