// 268. Missing Number -> 

class Search {

    public void Swap(int[] a, int x, int y) {

        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    public int missingNumber(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i];
            if (a[i] < a.length && a[i] != a[correct]) { // Loop until array element is smaller than the array size &&
                                                         // array element isn't equals to its respective index
                Swap(a, i, correct);
            } else {
                i++;
            }
        }

        // Search for the 1st missing number
        for (i = 0; i < a.length; i++) {
            if (a[i] != i) {
                return i;
            }
        }
        return a.length;
    }
}

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = { 5, 4, 7, 1, 6, 2, 3, 0 };

        Search s = new Search();
        int c = s.missingNumber(a);
        if (c != -1) {
            System.out.printf("%d is missing", c);
        } else {
            System.out.printf("All numbers are in correct position");
        }
    }
}
