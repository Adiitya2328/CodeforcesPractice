import java.util.Scanner;
public class SumOfRound{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i= 0; i< t; i++){
            int n = sc.nextInt();
            int count = 0;

            int temp = n;
            while(temp>0){
                if(temp%10 != 0){
                    count++;
                }
                temp = temp/10;
            }
            System.out.println(count);
            int place = 1;
            temp = n;
            while(temp>0){
                int digit = temp % 10;

                if (digit != 0) {
                    System.out.print(digit * place + " ");
                }

                place = place * 10;
                temp = temp / 10;
            }
            System.out.println();
        }
    }
}