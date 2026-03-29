import java.util.*;
public class SimpleSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i< t ;i++){
            int n = sc.nextInt();
            for(int k = n ; k>0 ; k--){
                System.out.println(k);
            }
        }
    }
}