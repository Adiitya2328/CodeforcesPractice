import java.util.Scanner;
public class NextRound{
    public static void main(String[] args){
        Scanner sc  = new Scanner (System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
             int[] scores = new int[n];
             for (int i = 0 ; i < n ; i++){
                scores[i] = sc.nextInt();
             }

             int kthPlace = scores[k-1];

             int cnt = 0;
             for (int i = 0 ; i< n ; i++){
                if (scores[i] >= kthPlace  && scores[i] > 0){
                    cnt++;
                }
             }
             System.out.println(cnt);
    }
}