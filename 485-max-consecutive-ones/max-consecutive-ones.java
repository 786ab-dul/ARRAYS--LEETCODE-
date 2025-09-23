//Abdul's
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;

        int currCount = 0;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                currCount++;
                maxCount = Math.max(maxCount, currCount);
            } else {
                currCount = 0;
            }
        }
        return maxCount;
    }
}