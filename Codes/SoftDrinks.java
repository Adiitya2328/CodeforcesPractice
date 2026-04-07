import java.util.*;
public class SoftDrinks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int drink = k*l;
        int toast = drink/nl;
        int limes = c*d;
        int salt  = p/np;
        int min = Math.min(toast, Math.min(limes , salt));
        int ans = min/n;
        System.out.println(ans);
    }
}