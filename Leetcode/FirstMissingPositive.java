// 41. First Missing Positive
// Amazon

class Search {

    public void Swap(int[] a, int x, int y) {

        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    public int firstMissingPositive(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] > 0 && a[i] <= a.length && a[i] != a[correct]) {
                Swap(a, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] != j + 1) {
                return j + 1;
            }
        }
        return a.length + 1;
    }
}

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] a = { 7, 8, 9, 11, 12 };

        Search s = new Search();
        int result = s.firstMissingPositive(a);
        System.out.println(result);
    }
}
