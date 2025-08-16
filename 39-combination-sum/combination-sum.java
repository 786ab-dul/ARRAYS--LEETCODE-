//Abdul's
class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        //c=candidate and t=target
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(c);
        backTrack(c, t, 0, new ArrayList<>(), result);
        return result;
    }

    private void backTrack(int c[], int t, int s, List<Integer> current, List<List<Integer>> result) {
        if (t == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = s; i < c.length; i++) {
            if (c[i] > t) {
                break;
            }
            current.add(c[i]);
            backTrack(c, t - c[i], i, current, result);
            current.remove(current.size() - 1);
        }
    }
}