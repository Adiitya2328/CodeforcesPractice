import java.util.Scanner;

public class FavouriteSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int[] arr = new int[n]; 
            int[] res = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int l = 0;
            int r = n - 1;
            int k = 0;

            while (l < r) {
                res[k++] = arr[l++];
                res[k++] = arr[r--];
            }

            if (l == r) {
                res[k] = arr[l];
            }

            
            for (int m = 0; m < n; m++) {
                System.out.print(res[m] + " ");
            }
            
        }

    
    }
}