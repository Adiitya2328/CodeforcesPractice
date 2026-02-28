import java.util.Scanner;
public class shortSubstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t; i++){
            String b = sc.next();
            String a = "";

            a += b.charAt(0);
            for(int j = 1; j< b.length(); j+=2){
                a +=b.charAt(j);
            }
         System.out.println(a);
        }
       
    }
}