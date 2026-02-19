
import java.util.Scanner;

public class LoveStory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String target = "codeforces";
        for (int i = 0; i < n; i++) {
            int count = 0;
            String s = sc.next();
            for (int j = 0; j < target.length(); j++) {
                if (s.charAt(j) != target.charAt(j)) {
                    count++;

                }
            }
            System.out.println(count);

        }

    }
}
