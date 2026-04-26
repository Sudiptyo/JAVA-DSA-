import java.util.Scanner;

public class PowerofSomething {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter base: ");
            int base = sc.nextInt();

            System.out.print("Enter power: ");
            int power = sc.nextInt();

            int ans = 1;

            while (power > 0) {
                if ((power & 1) == 1) { // if the least significant bit is 1
                    ans *= base; // multiply the current base to the answer
                }
                base *= base; // square the base for the next iteration
                power = power >> 1; // right shift the power by 1 (divide by 2)
            }

            System.out.print(ans);
        }
    }
}
