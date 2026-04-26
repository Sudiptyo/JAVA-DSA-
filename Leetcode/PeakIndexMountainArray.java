// 852. Peak Index in a Mountain Array ( Bitonic Array )

class Solution {
    int peakIndexInMountainArray(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Dec part of the array
            // This may be the ans but look at left
            // This is why end != mid - 1

            if (nums[mid] > nums[mid + 1])
                end = mid;
            else
                start = mid + 1; // mid + 1 > mid
        }
        return start; // or end as both are equal now
    }
}

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9, 8, 6, 4, 2 };

        Solution s = new Solution();
        System.out.println(s.peakIndexInMountainArray(nums));
    }
}
