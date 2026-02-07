import java.util.Scanner;
public class WordCapitalization{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char firstchar = Character.toUpperCase(s.charAt(0));
        String result = firstchar + s.substring(1);
        System.out.println(result);

    }
}