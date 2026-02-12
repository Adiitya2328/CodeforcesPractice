import java.util.Scanner;
public class  Translation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (s.length() != t.length()) {
            System.out.println("NO");
            return;
        }

        int i = 0;
        int j = t.length()-1;
        boolean isSame = true;


        while(i< s.length()){
            if(s.charAt(i) != t.charAt(j)){
                isSame = false;
                break;
            }
            i++;
            j--;
        }

       if(isSame ){
        System.out.println("YES");
       } else{
        System.out.println("NO");
       }
    }
}