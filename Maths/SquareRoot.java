// Time Complexity: O(sqrt(n) * p) - where n is the input number and p is the precision. The binary search runs in O(sqrt(n)) and the incremental search runs in O(p).


import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            System.out.print("Enter precision point: ");
            int p = sc.nextInt();

            double result = SqRoot(n, p);

            if (result != -1) {
                System.out.printf("Square Root of %d is: %." + p + "f", n, result);
            } else {
                System.out.printf("No possible Square Roots exists !");
            }
        }
    }

    static double SqRoot(int n, int p) {
        int low = 0;
        int high = n;

        double root = 0.0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == n)
                return mid;
            else if (mid * mid < n)
                low = mid + 1;
            else
                high = mid - 1;
        }

        root = high; // high becomes the greatest number whose square is less than n

        // After binary search finds the integer part of square root,
        // use incremental precision search:
        // Start with increment = 0.1
        // Keep increasing root while (root * root <= n)
        // When exceeded, step back once
        // Reduce increment by 10 each iteration
        // Repeat p times to get p decimal precision

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
