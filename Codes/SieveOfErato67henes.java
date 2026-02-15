import java.util.Scanner;
public class SieveOfErato67henes{
    public static void main(String[ ] args){
        Scanner sc  =  new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t; i++){
            int n = sc.nextInt();

            boolean present = false;
            for(int j = 0; j<n ; j++){
                int num = sc.nextInt();
                if (num == 67){
                    present = true ;
                }
            }
            if(present){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

            
        }

    }
}