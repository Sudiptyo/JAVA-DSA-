import java.util.Scanner;

class Searches {

    // return the index of smallest no. >= target

    public int ceilIndex(int[] a, int k) {

        if (a.length == 0)
            return -1;

        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == k)
                return mid;

            else if (k < a[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        if (low == a.length) // target is greater than the greatest no. in array
            return -1;

        return low;
    }
}

public class Ceil {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] a = { 1, 2, 3, 4, 5 };

            System.out.print("Enter an element to search: ");
            int k = sc.nextInt();

            Searches s = new Searches();

            int result = s.ceilIndex(a, k);
            if (result != -1) {
                System.out.printf("Ceil of %d is %d at index %d", k, a[result], result);
            } else {
                System.out.printf("Ceil does not exist");
            }
        }
    }
}
