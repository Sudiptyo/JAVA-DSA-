
import java.util.Scanner;

class Searches {
    public int intSearch(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public int stringSearch(String[] s, String t) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

}

public class LinearSearch {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.printf("Choices: ");
            System.out.printf(" \n 1. Search in Integers\n 2. Search in Strings\n");
            System.out.printf("Enter Your Choice: ");
            int c = sc.nextInt();

            Searches ls = new Searches();

            switch (c) {
                case 1 -> {
                    int k, n;
                    System.out.print("Enter the size of the Array: ");
                    n = sc.nextInt();
                    int[] a = new int[n];
                    System.out.println("Enter Array Elements: ");
                    for (int i = 0; i < a.length; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        a[i] = sc.nextInt();
                    }
                    System.out.print("Array Elements: ");
                    for (int i = 0; i < a.length; i++) {
                        System.out.printf("%d ", a[i]);
                    }
                    System.out.println();
                    System.out.print("Enter an Element to Search: ");
                    k = sc.nextInt();
                    int res1 = ls.intSearch(a, k);
                    if (res1 != -1) {
                        System.out.printf("%d found at index %d\n", k, res1);
                    } else {
                        System.out.print("Element not found !");
                    }
                }

                case 2 -> {
                    System.out.print("Enter number of strings: ");
                    int m = sc.nextInt();
                    sc.nextLine();
                    String[] s = new String[m];
                    System.out.println("Enter strings:");
                    for (int i = 0; i < m; i++) {
                        s[i] = sc.nextLine();
                    }
                    System.out.println();
                    System.out.print("Enter an Element to Search: ");
                    String t = sc.nextLine();
                    int res2 = ls.stringSearch(s, t);
                    if (res2 != -1) {
                        System.out.printf("%s found at index %s\n", t, res2);
                    } else {
                        System.out.print("Element not found !");
                    }
                }

                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}