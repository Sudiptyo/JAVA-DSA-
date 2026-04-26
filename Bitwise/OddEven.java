import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            // if ((n & 1) == 0) { // Bitwise AND -> if the least significant bit is 0, it's even; if it's 1, it's odd
            //     System.out.printf("Even !");
            // } else {
            //     System.out.printf("Odd !");
            // }

            if ((n | 0) == 1) { // Bitwise AND -> if the least significant bit is 0, it's even; if it's 1, it's odd
                System.out.printf("Odd !");
            } else {
                System.out.printf("Even !");
            }
        }
    }
}