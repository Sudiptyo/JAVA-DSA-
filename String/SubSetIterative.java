
import java.util.ArrayList;
import java.util.List;

public class SubSetIterative {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        List<List<Integer>> result = subSet(a);
        for (List<Integer> l : result) {
            System.out.println(l);
        }
    }

    static List<List<Integer>> subSet(int[] a) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : a) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
