import java.util.*;
public class horseshoe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> sets = new HashSet<>();
        
        int[] shoe = new int[4];
        for(int i = 0 ; i<4 ; i++){
            shoe[i] = sc.nextInt();

        }
        for(int i = 0 ; i< 4; i++){
            sets.add(shoe[i]);
        }

        int ans  = 4 - sets.size();
        System.out.println(ans);
    }
}