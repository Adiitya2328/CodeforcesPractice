
import java.util.Scanner;

public class cipherShifer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 0 ; tc<t; tc++){
            int n = sc.nextInt();
            String s = sc.next();
            int i = 0;
            String res = "";
            while(i<n){
                res += s.charAt(i);
                int j = i+1;
                while(j<n && s.charAt(j) != s.charAt(i)){
                    j++;
                }
                i = j+1;

            }
            System.out.println(res);
        }
    }
    
}