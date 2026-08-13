class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int first = nums[i];
            int sec = target - first;
            if(map.containsKey(sec)){
                return new int[]{i, map.get(sec)};
            }
            map.put(first, i);
        }
        return new int[]{};
    }
}