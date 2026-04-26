import java.util.Scanner;

class Searches {
    public int[] intSearch(int[][] a, int k) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == k) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}

public class TwoDArray {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int k, m, n;
            System.out.print("Enter the no. of Rows of the Array: ");
            m = sc.nextInt();
            System.out.print("Enter the no. of Columns of the Array: ");
            n = sc.nextInt();

            int[][] a = new int[m][n];

            System.out.println("Enter Array Elements: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.printf("Enter element [%d][%d] : ", i + 1, j + 1);
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.print("Array Elements: ");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.printf("%d ", a[i][j]);
                }
            }

            System.out.println();
            System.out.print("Enter an Element to Search: ");
            k = sc.nextInt();

            Searches s = new Searches();
            int[] res1 = s.intSearch(a, k);
            if (res1[0] != -1) {
                System.out.printf("%d found at index [%d][%d]\n", k, res1[0] + 1, res1[1] + 1);
            } else {
                System.out.print("Element not found !");
            }
        }
    }
}
