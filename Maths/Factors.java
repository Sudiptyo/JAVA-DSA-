
import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            Factor(n);
        }
    }

    // Both Time & Space will be O(sqrt(n))
    static void Factor(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    a.add(n / i);
                }
            }
        }
        for (int i = a.size() - 1; i >= 0; i--) {
            System.out.print(a.get(i) + " ");
        }
    }

}
