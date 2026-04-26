// Amazon 

class Search {
    int Separation(int[] nums, int target) {

        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int newStart = end + 1;

            // sizeofBox = end + start + 1
            // end = previous end + sizeofBox * 2

            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return BinarySearch(nums, target, start, end);

    }

    int BinarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;

            else if (target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {
                1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10,
                12, 12, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                42, 43, 44, 45, 46, 47, 48, 49, 50,
                52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                72, 73, 74, 75, 76, 77, 78, 79, 80,
                82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100,
                100, 100, 100, 101, 102, 103, 104, 105
        };

        int target = 10;
        Search s = new Search();
        System.out.println(s.Separation(nums, target));
    }
}
