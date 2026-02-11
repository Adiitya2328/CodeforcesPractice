import java.util.*;
public class  SquareString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

       String s1 = s.substring(0, n/2);
        String s2 = s.substring(n/2, n);

        if(s1.equals(s2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}