import java.util.Scanner;

class Searches {

    // return the index of greatest no. >= target

    public int floorIndex(int[] a, int k) {

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

        if (high < 0)
            return -1;

        return high;
    }
}

public class Floor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] a = { 1, 2, 3, 4, 8 };

            System.out.print("Enter an element to search: ");
            int k = sc.nextInt();

            Searches s = new Searches();

            int result = s.floorIndex(a, k);
            if (result != -1) {
                System.out.printf("Floor of %d is %d at index %d", k, a[result], result);
            } else {
                System.out.printf("Floor does not exist");
            }
        }
    }
}