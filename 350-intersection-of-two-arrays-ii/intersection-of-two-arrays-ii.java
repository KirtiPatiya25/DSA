class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int i=0;

        for(int num : nums2){
            if (map.containsKey(num) && map.get(num) > 0){
                ans[i++] = num;
                map.put(num, map.get(num) - 1);
            }
        }
        return Arrays.copyOf(ans, i); 
    }
}