import java.util.*;
public class AmusingJoke{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String h  = sc.next();
        String g  = sc.next();
        String p = sc.next();

        String s = h+g;
        char[] arr1 = s.toCharArray();
        char[] arr2 = p.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}