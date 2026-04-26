import java.util.Scanner;

public class XORRange {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a range: ");
            int n = sc.nextInt();
            int xor = 0;

            for (int i = 0; i <= n; i++) {
                xor ^= i;
            }
            System.out.print(xor);
        }
    }
}
