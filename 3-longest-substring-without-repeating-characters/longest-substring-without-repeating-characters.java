class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;

        HashSet<Character> myChar = new HashSet<>();

        for(int right = 0; right < s.length(); right++){
            while(myChar.contains(s.charAt(right))){
                myChar.remove(s.charAt(left));
                left++;
            }
            myChar.add(s.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}