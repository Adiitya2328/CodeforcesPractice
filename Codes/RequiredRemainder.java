import java.util.*;
public class RequiredRemainder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i< t;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            int n= sc.nextInt();
            if(n-n%x+y<=n){
                System.out.println(n-n%x+y);
            }else{
                System.out.println(n-n%x-(x-y));
            }
        }
    }
}