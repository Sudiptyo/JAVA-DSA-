import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();

            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();

            int lcm = a * b / HCF(a, b);
            System.out.print(lcm);
        }
    }

    static int HCF(int a, int b) {
        if (b == 0)
            return a;

        return HCF(b, a % b);
    }

}
