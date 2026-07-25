class Solution {

    private Boolean[][] dp;

    private boolean subsets(int[] nums, int index, int target) {

        if (target == 0) return true;

        if (index >= nums.length || target < 0) {
            return false;
        }

        if (dp[index][target] != null) {
            return dp[index][target];
        }

        // Exclude current element
        boolean exclude = subsets(nums, index + 1, target);

        // Include current element
        boolean include = subsets(nums, index + 1, target - nums[index]);

        return dp[index][target] = include || exclude;
    }

    public boolean canPartition(int[] nums) {

        int sum = 0;

        for (int x : nums) {
            sum += x;
        }

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;

        dp = new Boolean[nums.length][target + 1];

        return subsets(nums, 0, target);
    }
}