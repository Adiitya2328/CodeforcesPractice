
import java.util.Scanner;

public class beautifulMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int row = -1, col = -1;

for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        int x = sc.nextInt();  // take input directly
        if (x == 1) {
            row = i;
            col = j;
        }
    }
}

int move1 = Math.abs(row -2);
int move2 = Math.abs(col-2);
int move = move1+move2;
System.out.println(move);
    }
}