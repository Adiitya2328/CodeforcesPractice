import java.util.*;

public class DifferentString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--> 0) {
            String s = sc.next();
            int n = s.length();

            boolean same = true;
            for (int i = 1; i<n; i++) {
                if (s.charAt(i) != s.charAt(0)) {
                    same = false;
                    break;
                }
            }

            if (same) {
                System.out.println("NO");
            } else {
                char[] arr = s.toCharArray();
                Arrays.sort(arr);

                String r ="";
                for (int i = 0; i < n; i++) {
                    r += arr[i];
                }

                if (r.equals(s)) {
                    String temp = "";
                    for (int i = n - 1; i >= 0; i--) {
                        temp += r.charAt(i);
                    }
                    r = temp;
                }

                System.out.println("YES");
                System.out.println(r);
            }
        }

    }
}