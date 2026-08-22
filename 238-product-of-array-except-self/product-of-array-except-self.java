class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int prefix = 1;
        for(int i =0; i<nums.length; i++){
            answer[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;
        for(int j=nums.length-1; j>=0; j--){
            answer[j] = answer[j] * suffix;
            suffix = suffix * nums[j];
        }
        return answer;
    }
}