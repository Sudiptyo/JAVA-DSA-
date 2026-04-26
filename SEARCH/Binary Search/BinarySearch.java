
import java.util.Scanner;

class Searches {
    public int binarySearch(int[] a, int k) {

        if (a.length == 0)
            return -1;

        int low = 0, high = a.length - 1;

        boolean isAscending = a[0] <= a[a.length - 1];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == k)
                return mid;

            if (isAscending) {
                if (k < a[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (k < a[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // int[] a = { 1, 2, 3, 4, 5 };
            int[] a = { 5, 4, 3, 2, 1 };

            System.out.print("Enter an element to search: ");
            int k = sc.nextInt();

            Searches s = new Searches();

            int result = s.binarySearch(a, k);
            if (result != -1) {
                System.out.printf("%d found at index %d", k, result);
            } else {
                System.out.printf("%d not found", k);
            }
        }
    }
}
