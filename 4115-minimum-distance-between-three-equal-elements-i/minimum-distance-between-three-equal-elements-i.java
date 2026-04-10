class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int ans = Integer.MAX_VALUE;

        for(List<Integer> list: map.values()){
            if(list.size()>= 3){
                for(int i=0; i+2<list.size();i++){
                    int a = list.get(i);
                    int b = list.get(i+1);
                    int c = list.get(i+2);

                    int dis = 2*(c-a);

                    ans = Math.min(ans, dis);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}