import java.util.ArrayList;

// Backtracking

public class MazeAllDirections {
    public static void main(String[] args) {

        boolean[][] board = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };

        ArrayList<String> ans = mazeDirection("", board, 0, 0);

        System.out.println(ans);
        System.out.println("Total Paths = " + ans.size());
    }

    static ArrayList<String> mazeDirection(String p, boolean[][] maze, int r, int c) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
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

        // move down
        if (r < maze.length - 1) {
            paths.addAll(mazeDirection(p + 'R', maze, r + 1, c));
        }

        // move up
        if (r > 0) {
            paths.addAll(mazeDirection(p + 'U', maze, r - 1, c));
        }

        // move right
        if (c < maze[0].length - 1) {
            paths.addAll(mazeDirection(p + 'L', maze, r, c + 1));
        }

        // move left
        if (c > 0) {
            paths.addAll(mazeDirection(p + 'D', maze, r, c - 1));
        }

        // move diagonal
        if (r < maze.length - 1 && c < maze[0].length - 1) {
            paths.addAll(mazeDirection(p + 'K', maze, r + 1, c + 1));
        }

        // This is where the function will be over
        // So before the function gets removed, also remove the changes that were made by the function

        // unmark
        maze[r][c] = true;

        return paths;
    }
}