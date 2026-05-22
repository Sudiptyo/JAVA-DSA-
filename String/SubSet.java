
import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        List<String> result = subSet("", "siuuuu");
       System.out.printf("Subsets: %s\nTotal count: %d", result, result.size());
    }

    static List<String> subSet(String p, String up) {
        if (up.isEmpty()) {
            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        char ch = up.charAt(0);

        List<String> left = subSet(p + ch, up.substring(1)); // Include

        List<String> right = subSet(p, up.substring(1)); // Exclude

        left.addAll(right);

        return left;
    }
}
