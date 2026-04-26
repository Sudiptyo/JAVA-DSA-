import java.util.Scanner;

public class Euclidean {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt(); // 18

            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt(); // 12

            // 1. Repeat while `b != 0`
            // current `a` is the HCF.

            // 2. Find remainder:
            // rem = a % b
            // → The remainder keeps the common divisibility information between `a` and
            // `b`.

            // 3. Replace `a` with `b`
            // → The smaller number becomes the new first number for the next step.

            // 4. Replace `b` with `rem`
            // → The remainder becomes the new second number because:
            // gcd(a,b) = gcd(b,a\bmod b)

            // 5. Continue the process
            // → Each step reduces the numbers while preserving the HCF.

            // 6. When `b = 0`
            // → The remaining value in `a` is the greatest number dividing both numbers
            // exactly.

            // gcd(a,b) = gcd(b,a\bmod b)

            while (b != 0) {
                int rem = a % b;
                a = b;
                b = rem;
            }
            System.out.print(a);
            System.out.println();
            System.out.print(gcd(a, b));
        }
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(a % b, b);
    }
}
