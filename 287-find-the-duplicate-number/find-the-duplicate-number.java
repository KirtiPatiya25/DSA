class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<=n; i++){
            if(s.contains(nums[i])){
                return nums[i];
            }
            else{
                s.add(nums[i]);
            }
        }
        return 0;
    }
}