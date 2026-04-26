
import java.util.Scanner;
import utils.NumberUtils;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter base: ");
        int b = sc.nextInt();

        try {
            int digits = NumberUtils.countDigits(n, b);
            System.out.println("Number of digits: " + digits);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}