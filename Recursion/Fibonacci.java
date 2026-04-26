import java.util.Scanner;

public class Fibonacci {

    int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the limit: ");
            int n = sc.nextInt();

            Fibonacci f = new Fibonacci();
            System.out.println("Fibonacci of " + n + " is: " + f.fibonacci(n));
        }
    }
}