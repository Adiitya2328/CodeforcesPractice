import java.util.*;

public class MinutesBeforeNewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i= 0 ; i<t;i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            
            int current = h * 60 + m;
            int remaining = 1440 - current;
            
            System.out.println(remaining);
        }
    }
}