import java.util.*;
public class APlusB{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        for(int i = 0 ; i<n ;i++){
            String s = sc.next();
            int num1 = s.charAt(0)-'0';
            int num2 = s.charAt(2)-'0';
            System.out.println(num1 +num2);
        }
    }
}