class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(right > left){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}