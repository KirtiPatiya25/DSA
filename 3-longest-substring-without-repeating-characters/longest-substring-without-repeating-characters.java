class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int max = 0;
        while(j<s.length()){
            char c = s.charAt(j);
            
            if(map.containsKey(c)){
                if(map.get(c) >= i){
                    i = map.get(c) + 1;

                }
            }

            map.put(c, j);
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}