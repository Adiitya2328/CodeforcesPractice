import java.util.Scanner;
public class InSearchOfEasyProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cn = 0;
        for (int i = 0; i<n;i++){
            int t = sc.nextInt();
         if(t == 1){
            cn =1;
        }
        }
       if(cn == 1){
        System.out.println("Hard");
       }else{
        System.out.println("Easy");
       }

    }
}
