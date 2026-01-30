import java.util.*;
public class YesOrYes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            String s = scanner.next();
            if(s.toLowerCase().equals("yes")){
                System.out.println("YES");
            }
            else{System.out.println("NO");}    
        
        
    }
}
}