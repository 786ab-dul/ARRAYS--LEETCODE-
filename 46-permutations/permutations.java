//Abdul's
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        backtrack(results, nums, 0);
        return results;

    }

    public void backtrack(List<List<Integer>> results, int[] nums, int start) {
        if (start == nums.length) {
            results.add(toList(nums));
        } else {
            for (int i = start; i < nums.length; i++) {
                swap(i, start, nums);
                backtrack(results, nums, start + 1);
                swap(i, start, nums);
            }
        }
    }

    public List<Integer> toList(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i : nums)
            res.add(i);
        return res;
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}