
import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        ArrayList<String> ans = path("", 3, 3);
        System.out.println(ans);
        System.out.println("Total Paths = " + ans.size());
    }

    // D = move Down
    // R = move Right

    static ArrayList<String> path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }

        ArrayList<String> paths = new ArrayList<>();

        // move down
        if (r > 1) {
            paths.addAll(path(p + 'D', r - 1, c));
        }

        // move right
        if (c > 1) {
            paths.addAll(path(p + 'R', r, c - 1));
        }

        return paths;
    }
}
