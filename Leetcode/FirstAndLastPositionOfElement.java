import java.util.Scanner;

class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        ans[0] = findIndex(nums, target, true); // first
        ans[1] = findIndex(nums, target, false); // last

        return ans;
    }

    int findIndex(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;

                if (findStartIndex)
                    high = mid - 1; // go LEFT
                else
                    low = mid + 1; // go RIGHT

            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int[] nums = { 5, 7, 7, 8, 8, 10 };

            System.out.print("Enter target: ");
            int target = sc.nextInt();

            Solution s = new Solution();

            int[] result = s.searchRange(nums, target);

            System.out.printf("Output: [%d, %d]\n", result[0], result[1]);
        }
    }
}