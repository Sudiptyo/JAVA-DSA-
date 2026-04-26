// 287. Find the Duplicate Number
// Amazon

class Search {

    public void Swap(int[] a, int x, int y) {

        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    public int duplicateNumber(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] != a[correct]) {
                Swap(a, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] != j + 1) {
                return a[j];
            }
        }
        return -1;
    }
}

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] a = { 5, 4, 4, 7, 1, 2, 3, 3 };

        Search s = new Search();
        int result = s.duplicateNumber(a);
        System.out.println(result);
    }
}
