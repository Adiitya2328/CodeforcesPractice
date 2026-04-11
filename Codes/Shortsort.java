import java.util.*;
public class Shortsort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++){
            String s = sc.next();
            int n =s.length();
            if(s.charAt(0) == 'a' || s.charAt(1) == 'b' || s.charAt(2) == 'c'){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }

    }
}