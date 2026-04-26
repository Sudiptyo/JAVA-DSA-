import java.util.Scanner;

public class NumberOfSetBits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            int count = 0;

            while (n > 0) {
                if ((n & 1) == 1) {
                    count++;
                }
                n = n >> 1;
            }
            System.out.print(count);
        }
    }
}
