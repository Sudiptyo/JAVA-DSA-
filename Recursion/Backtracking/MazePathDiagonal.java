import java.util.ArrayList;

public class MazePathDiagonal {
    public static void main(String[] args) {
        ArrayList<String> ans = pathDiagonal("", 3, 3);
        System.out.println(ans);
        System.out.println("Total Paths = " + ans.size());
    }

    // V = move Down
    // H = move Right
    // D = Diagonal

    static ArrayList<String> pathDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }

        ArrayList<String> paths = new ArrayList<>();

        // move down
        if (r > 1) {
            paths.addAll(pathDiagonal(p + 'V', r - 1, c));
        }

        // move right
        if (c > 1) {
            paths.addAll(pathDiagonal(p + 'H', r, c - 1));
        }

        // move diagonal
        if (r > 1 && c > 1) {
            paths.addAll(pathDiagonal(p + 'D', r - 1, c - 1));
        }

        return paths;
    }
}
