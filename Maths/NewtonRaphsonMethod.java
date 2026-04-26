// Newton Raphson Method -> It is a root-finding algorithm that uses the concept of linear approximation to find the roots of a real-valued function. The method iteratively refines guesses for the root by using the formula:
//  x -> The current guess for the root
//  f(x) -> The value of the function at the current guess

import java.util.Scanner;

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            System.out.printf("%.3f", NRM(n));
        }

    }

    // Algorithm for Newton-Raphson Method:
    //
    // 1. Start with an initial guess x = n
    // 2. Compute improved approximation using:
    // root = 0.5 * (x + n / x)
    // 3. Check convergence:
    // if |root - x| is very small, stop
    // 4. Otherwise:
    // set x = root
    // repeat steps 2–4
    // 5. Return root as the approximate square root

    static double NRM(int n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + (n / x));

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }
        return root;
    }
}