import java.util.*;
public class VasyaTheHipster{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = Math.min(a,b);
        int d = Math.max((a-Math.min(a,b))/2 , (b-Math.min(a,b))/2);

        System.out.println(c);
        System.out.println(d);
    }
}