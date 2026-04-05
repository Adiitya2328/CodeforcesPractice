import java.util.*;
public class The6_7IntegerProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0 ; i<t ; i++){
            int[] arr = new int[7];
            int sum =0;
            int Maxsum = Integer.MIN_VALUE;
            for(int j=0; j< 7 ; j++){
                arr[j] = sc.nextInt();
            }
            for(int j = 0 ; j<7; j++){
                sum = sum+arr[j];
                Maxsum = Math.max(Maxsum, arr[j]);
            }
            System.out.println(2*Maxsum-sum);
            
        }
    }
}