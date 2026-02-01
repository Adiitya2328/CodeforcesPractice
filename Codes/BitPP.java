import java.util.*;
public class BitPP{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            String op  = sc.next();
            if (op.equals("X++") ){
                x++;
            }
            else if(op.equals("X--")){
                x--;
            }
            else if (op.equals("++X")){
                ++x;
            }
            else{
                --x;
            }

        }
        System.out.println(x);
    }
    
}