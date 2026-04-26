// 442. Find All Duplicates in an Array
// Amazon
// Microsoft


import java.util.ArrayList;
import java.util.List;

class Search {

    public void Swap(int[] a, int x, int y) {

        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    public List<Integer> findDuplicates(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] != a[correct]) {
                Swap(a, i, correct);
            } else {
                i++;
            }
        }

        ArrayList<Integer> al = new ArrayList<>();

        for (int j = 0; j < a.length; j++) {
            if (a[j] != j + 1) {
                al.add(a[j]);
            }
        }
        return al;
    }
}

public class AllDuplicateNumber {
    public static void main(String[] args) {
        int[] a = { 5, 4, 4, 7, 1, 2, 3, 3 };

        Search s = new Search();
        List<Integer> result = s.findDuplicates(a);
        System.out.println(result);
    }
}
