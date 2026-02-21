import java.util.Scanner;
public class CodeforcesChecking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "codeforces";
        
        int n = sc.nextInt();
        for(int i =0 ; i<n;i++){
            char c = sc.next().charAt(0);
            if(s.indexOf(c) != -1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}