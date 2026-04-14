import java.util.*;
public class CollectingCoins{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            int max = Math.max(a, Math.max(b, c));

            int needed = (max - a) + (max - b) + (max - c);

            if (n < needed) {
                System.out.println("NO");
            } else if ((n - needed) % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}