import java.util.*;
public class BlackSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i<4 ;i++){
            arr[i]  = sc.nextInt();
        }
        String s = sc.next();
        int sum = 0;
        int n = s.length();
        for(int i = 0 ; i<n; i++){
            if(s.charAt(i) == '1'){
                sum+=arr[0];
            }else if(s.charAt(i) == '2'){
                sum+=arr[1];
            }else if(s.charAt(i) == '3'){
                sum+=arr[2];
            }else if(s.charAt(i) == '4'){
                sum+= arr[3];
            }
        }
        System.out.println(sum);
    }
}