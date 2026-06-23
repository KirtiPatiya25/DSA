class Solution {
    void getPerms(int[] nums, int idx, List<List<Integer>> ans) {
        if (idx == nums.length) {
            List<Integer> curr = new ArrayList<>();

            for (int num : nums) {
                curr.add(num);
            }

            ans.add(curr);
            return;
        }

        for (int i = idx; i < nums.length; i++) {

            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;

            getPerms(nums, idx + 1, ans);

            temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getPerms(nums, 0, ans);
        return ans;
    }
}