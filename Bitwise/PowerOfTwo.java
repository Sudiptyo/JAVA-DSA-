
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n > 0 && ((n & (n - 1)) == 0)) {
                System.out.printf("Power of 2");
            } else {
                System.out.printf("Not power of 2");
            }
        }
    }
}