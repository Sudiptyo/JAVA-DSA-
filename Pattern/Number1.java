import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Row number: ");
            int n = sc.nextInt();

            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.printf("%d ", col);
                }
                System.out.println();
            }
        }
    }
}
