// 448. Find All Numbers Disappeared in an Array
// Amazon


import java.util.ArrayList;
import java.util.List;

class Search {

    public void Swap(int[] a, int x, int y) {

        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    public List<Integer> missingNumber(int[] a) {
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

        ArrayList<Integer> al = new ArrayList<>();

        // Search for the 1st missing number
        for (i = 0; i < a.length; i++) {
            if (a[i] != i) {
                al.add(i);
            }
        }
        return al;
    }
}

public class MissingAllNumbers {
    public static void main(String[] args) {
        int[] a = { 5, 4, 7, 1, 2, 3, 0 };

        Search s = new Search();
        List<Integer> result = s.missingNumber(a);
        System.out.println(result);
    }
}
