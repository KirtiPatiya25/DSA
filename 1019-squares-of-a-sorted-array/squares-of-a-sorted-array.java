class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] res = new int[nums.length];
        int i = 0; 
        int j = nums.length - 1;
        int k = nums.length - 1;

        while( i<= j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                res[k] = nums[i] * nums[i];
                i++;
            }
            else{
                res[k] = nums[j] * nums[j];
                j = j - 1;
            }
            k = k  - 1;
        }
        return res;
    }
}