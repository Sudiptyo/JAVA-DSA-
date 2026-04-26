// 832. Flipping an Image

// Google

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int[] row : image) {

            for (int i = 0; i < (row.length + 1) / 2; i++) {

                int temp = row[i] ^ 1;

                row[i] = row[row.length - i - 1] ^ 1;

                row[row.length - i - 1] = temp;
            }
        }

        return image;
    }
}

public class FlipAnImage {
    public static void main(String[] args) {

        int[][] image = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };

        Solution s = new Solution();
        int[][] result = s.flipAndInvertImage(image);

        // Print matrix
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}