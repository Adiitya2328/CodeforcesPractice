
import java.util.Scanner;

public class Magnets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String p = sc.next();
        int count = 1;
        for (int i = 0; i < n; i++) {
            String c = sc.next();
            if (!p.equals(c)) {
                count++;
            }
            p = c;
        }
        System.out.println(count);
    }
}
