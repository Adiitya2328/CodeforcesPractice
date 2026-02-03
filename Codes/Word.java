import java.util.*;
public class Word{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int uppercount = 0;
        int lowercount ;
        for (char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                uppercount++;
            }
        }
        lowercount = s.length() - uppercount;

        if (uppercount > lowercount){
            s= s.toUpperCase();
        }else{
            s = s.toLowerCase();
        }

        System.out.println(s);
    }
}