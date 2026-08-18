class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char ch : ransomNote.toCharArray()){
            if(map.containsKey(ch) && map.get(ch) > 0){
                map.put(ch, map.get(ch) - 1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}