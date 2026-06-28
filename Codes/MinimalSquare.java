
import java.util.Scanner;

public class MinimalSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t--> 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int maxa = Math.max(2*a , b);
            int maxb = Math.max(a , 2*b);

            int min = Math.min(maxa , maxb);
            System.out.println(min*min);
        }
    }
}