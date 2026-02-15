import java.util.*;
public class Division{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i< n ; i++){
            int t = sc.nextInt();
            if(t>=1900){
            System.out.println("Division 1");
        }else if(t >= 1600 && t<= 1899){
            System.out.println("Division 2");
        }else if(t >= 1400 && t<= 1599){
            System.out.println("Division 3");
        }else if(t <= 1399){
            System.out.println("Division 4");
        }
        }
        
    }
}