import java.util.Scanner;
public class BoysAndGirls{
    public static void main (String[] args){
        Scanner sc  =  new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0 ; i< s.length();i++){
            boolean isDiff = true ;
            for(int j = 0 ;j<i; j++){
                if (s.charAt(i) == s.charAt(j)){
                     isDiff = false;
                     break;
                }
            }
            if(isDiff){
                count++;
            }

        }
        if(count%2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}