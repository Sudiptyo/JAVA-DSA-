import java.util.ArrayList;
import java.util.Arrays;

public class MaazeAllPath {
    public static void main(String[] args) {

        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        int[][] path = new int[board.length][board[0].length];

        ArrayList<String> ans = mazePath("", board, 0, 0, path, 1);

        System.out.println(ans);
        System.out.println("Total Paths = " + ans.size());
    }

    static ArrayList<String> mazePath(String p, boolean[][] maze, int r, int c, int path[][], int step) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {

            path[r][c] = step;

            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);
            System.out.println();

            ArrayList<String> li = new ArrayList<>();
            li.add(p);

            return li;
        }

        ArrayList<String> paths = new ArrayList<>();

        // obstacle / visited
        if (!maze[r][c]) {
            return paths;
        }

        // mark visited
        maze[r][c] = false;
        path[r][c] = step;

        // move down
        if (r < maze.length - 1) {
            paths.addAll(mazePath(p + 'R', maze, r + 1, c, path, step + 1));
        }

        // move up
        if (r > 0) {
            paths.addAll(mazePath(p + 'U', maze, r - 1, c, path, step + 1));
        }

        // move right
        if (c < maze[0].length - 1) {
            paths.addAll(mazePath(p + 'L', maze, r, c + 1, path, step + 1));
        }

        // move left
        if (c > 0) {
            paths.addAll(mazePath(p + 'D', maze, r, c - 1, path, step + 1));
        }

        // move diagonal
        if (r < maze.length - 1 && c < maze[0].length - 1) {
            paths.addAll(mazePath(p + 'K', maze, r + 1, c + 1, path, step + 1));
        }

        // unmark
        maze[r][c] = true;
        path[r][c] = 0;

        return paths;
    }
}