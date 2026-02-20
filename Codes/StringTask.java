import java.util.*;
public class StringTask{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String a = s.toLowerCase();
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i<a.length();i++){
            char c = a.charAt(i);
            if(!(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='y' )){
                result.append('.').append(c);
            }
        }
        System.out.println(result.toString());
    }
}