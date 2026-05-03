import java.util.*;

public class Again25{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans  =  (long)(Math.pow(5, n)%100);
        System.out.println(ans);
    }
}