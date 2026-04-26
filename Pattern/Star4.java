import java.util.Scanner;

public class Star4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Row number: ");
            int n = sc.nextInt();

            // for (int row = 1; row <= n; row++) {
            // for (int col = 1; col <= row; col++) {
            // System.out.print("* ");
            // }
            // System.out.println();
            // }
            // for (int row = 2; row <= n; row++) {
            // for (int col = n; col >= row; col--) {
            // System.out.print("* ");
            // }
            // System.out.println();
            // }

            for (int row = 0; row < 2 * n; row++) {
                int totalColumnsInRow = row < n ? row + 1 : 2 * n - row - 1;
                for (int col = 0; col < totalColumnsInRow; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
