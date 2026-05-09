import java.util.ArrayList;

public class MazeWithObstacles {
    public static void main(String[] args) {

        boolean[][] board = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };

        ArrayList<String> ans = mazeObstacles("", board, 0, 0);

        System.out.println(ans);
        System.out.println("Total Paths = " + ans.size());
    }

    // V = move Down
    // H = move Right
    // D = Diagonal

    static ArrayList<String> mazeObstacles(String p, boolean[][] maze, int r, int c) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }

        ArrayList<String> paths = new ArrayList<>();

        // obstacle
        if (!maze[r][c]) {
            return paths;
        }

        // move down
        if (r < maze.length - 1) {
            paths.addAll(mazeObstacles(p + 'V', maze, r + 1, c));
        }

        // move right
        if (c < maze[0].length - 1) {
            paths.addAll(mazeObstacles(p + 'H', maze, r, c + 1));
        }

        // move diagonal
        if (r < maze.length - 1 && c < maze[0].length - 1) {
            paths.addAll(mazeObstacles(p + 'D', maze, r + 1, c + 1));
        }

        return paths;
    }
}