// 645. Set Mismatch

class Search {

    public void Swap(int[] a, int x, int y) {

        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    public int[] findErrorNums(int[] a) {
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
                return new int[] { a[j], j + 1 };
            }
        }
        return new int[] { -1, -1 };
    }
}

public class SetMismatch {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 4 };

        Search s = new Search();
        int[] result = s.findErrorNums(a);
        System.out.println(java.util.Arrays.toString(result));
    }
}
