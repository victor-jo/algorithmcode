class Solution {
    List<List<Integer>> results = new ArrayList<>();
    int[] candidates;
    int target;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        combinationSum(0, new Stack<>(), 0);
        return results;
    }

    public void combinationSum(int p, Stack<Integer> stack, int sum) {
        if (sum == target) {
            results.add(Arrays.asList(stack.toArray(new Integer[0])));
            return;
        }
        if (p >= candidates.length || sum > target) {
            return;
        }
        stack.push(candidates[p]);
        combinationSum(p, stack, sum + candidates[p]);
        stack.pop();
        combinationSum(p+1, stack, sum);
    }
}