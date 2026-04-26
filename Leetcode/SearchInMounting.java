// 1095. Find in Mountain Array

class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findInMountainArray(mountainArr);

        int firstTry = BinarySearch(mountainArr, target, 0, peak, true);
        if (firstTry != -1)
            return firstTry;

        return BinarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    public int BinarySearch(MountainArray mountainArr, int target, int start, int end, boolean isAscending) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = mountainArr.get(mid);

            if (value == target)
                return mid;

            if (isAscending) {
                if (target < value) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > value)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }

    public int peakIndexInMountainArray(MountainArray mountainArr) {

        int start = 0;
        int end = mountainArr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1))
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}

public class SearchInMounting {
    public static void main(String[] args) {

    }
}
