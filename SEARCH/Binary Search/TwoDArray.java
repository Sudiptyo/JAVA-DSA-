
import java.util.Scanner;

class Search {
    public int[] BinarySearch(int[][] a, int k) {

        int r = 0;
        int c = a[0].length - 1;

        while (r < a.length && c >= 0) {
            if (a[r][c] == k) {
                return new int[] { r, c };
            } else if (a[r][c] < k) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}

public class TwoDArray {
    public static void main(String[] args) {

        int[][] a = {
                { 1, 3, 5 },
                { 7, 9, 11 },
                { 13, 15, 17 }
        };

        Search s = new Search();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the target: ");
            int k = sc.nextInt();

            int[] result = s.BinarySearch(a, k);

            if (result[0] == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Found at index: [" + result[0] + ", " + result[1] + "]");
            }
        }
    }
}