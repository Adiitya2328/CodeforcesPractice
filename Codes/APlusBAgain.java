import java.util.Scanner;
public class APlusBAgain{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        for (int i = 0 ; i < n; i++){
            int num = sc.nextInt();
            int a= num/10;
        int b= num%10;
        System.out.println(a+b);   
        }
         
    }
}