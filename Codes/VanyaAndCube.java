import java.util.*;
public class VanyaAndCube{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int maxsum = 0;
        int count = 0;
        while(maxsum <= n){
            int sum = (i*(i+1))/2;
            maxsum += sum;
            count++;
            i++;

        }
        System.out.println(count-1);
    }
}