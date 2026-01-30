import java.util.*;
public class WayTooLong {
    public static void main(String[] args ){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i <= n ; i++){
            String s = sc.next();
            if(s.length() > 10){
                String word = s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1);
                System.out.println(word);
            } else {
                System.out.println(s);

        
            }
        }
    }
}