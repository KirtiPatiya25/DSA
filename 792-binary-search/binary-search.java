class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        return helper(nums, target, 0, n-1);
    }

    public int helper(int[] nums, int target, int st, int end) {
        // int n=nums.length;
        // int st = 0;
        // int end = n - 1;

        while(st <= end){
            int mid = (st + end) / 2;
            if(target > nums[mid]) return helper( nums,  target,mid+1, end);
            if(target < nums[mid]) return helper( nums,  target,st, mid-1);
            else return mid;
        }
        return -1;
    }
}