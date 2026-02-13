import java.util.*;
public class Lucky{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i<n ; i++){
            String s = sc.next();
            if (s.charAt(0)+s.charAt(1)+s.charAt(2) == s.charAt(4)+s.charAt(5)+s.charAt(3)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}