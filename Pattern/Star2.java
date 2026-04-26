import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Row number: ");
            int n = sc.nextInt();

            for (int row = 1; row <= n; row++) {
                for (int col = n; col >= row; col--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
