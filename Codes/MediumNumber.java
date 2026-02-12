import java.util.Scanner;
public class MediumNumber{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i< n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int median;
            if((a>=b && a<=c) || (a>=c && a<=b)){
                median = a;
            }else if((b>=a && b<=c) || (b>=c && b<=a)){
                median = b;
            }else{
                median = c;
            }
            System.out.println(median);
        }
        

    }
}