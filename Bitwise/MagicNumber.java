// Amazon

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            int base = 5;
            int ans = 0;

            while (a > 0) {
                int last = 0; // Get the last bit of the number (0 or 1)
                last = (a & 1); // Bitwise AND -> if the least significant bit is 0, it's even; if it's 1, it's
                                // odd
                ans += last * base; // Multiply the last bit by the current base (5^0, 5^1, 5^2, ...)
                base *= 5; // Update the base for the next bit (5^1, 5^2, 5^3, ...)
                a = a >> 1; // Right shift the number by 1 bit to process the next bit in the next iteration
            }
            System.out.println(ans);
        }
    }
}
