class Solution {
    private void backtrack(int start, List<Integer> current, int[] nums, List<List<Integer>> result) {
    result.add(new ArrayList<>(current)); // Add at EACH level, not just base case
    
    for (int i = start; i < nums.length; i++) {
        current.add(nums[i]);      // Choose
        backtrack(i + 1, current, nums, result);  // Explore
        current.remove(current.size() - 1);       // Un-choose (backtrack)
    }
}
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(0, new ArrayList<>(), nums, result); // Initialize current here!
    return result;
    }
}