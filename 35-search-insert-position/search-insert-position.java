//Abdul's
class Solution {
    public int searchInsert(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return startIndex;
    }
}