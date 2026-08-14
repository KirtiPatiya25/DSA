class Solution {
    public static int binarySearch(int[] nums, int left, int right, int target){
        // int left =0;
        // int right = nums.length-1;

        if(left>right){
            return -1;
        }
        int mid = left + (right-left)/2;

        if(nums[mid] == target) return mid;
        
        if(nums[mid] < target){
            return binarySearch(nums, mid+1, right, target);
        }
        return binarySearch(nums, left, mid-1, target);
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
}