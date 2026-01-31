import java.util.*;
public class PetyaAndString{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        String s1t = s1.toLowerCase();
        String s2t = s2.toLowerCase();
        
        if(s1t.compareTo(s2t)<0){
            System.out.println(-1)  ;
        }else if(s1t.compareTo(s2t)>0){
            System.out.println(1);
        }
        else{
            System.out.println(0)   ;
        }
    }
}