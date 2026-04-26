import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        NoOfDigits n = new NoOfDigits();
        int digits = n.No_ofDigits();
        System.out.println("Number of digits: " + digits);
    }

    int No_ofDigits() {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            System.out.print("Enter base: ");
            int b = sc.nextInt();

            int ans = (int) (Math.log(a) / Math.log(b)) + 1;
            // System.out.println(ans);
            return ans;
        }
    }
}
