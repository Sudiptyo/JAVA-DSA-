import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt(); // 5

            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt(); // 3

            a = a ^ b; // a becomes 6 (5 XOR 3)
            b = a ^ b; // b becomes 5 (6 XOR 3)
            a = a ^ b; // a becomes 3 (6 XOR 5)

            System.out.printf("First: %d\nSecond: %d", a, b);
        }
    }
}
