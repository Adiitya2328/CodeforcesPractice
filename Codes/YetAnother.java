
import java.util.Scanner;

public class YetAnother {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long dif = Math.abs(b - a);
            long adh = (dif +9)/10 ;
            System.out.println(adh);
        }
        
    }
}
