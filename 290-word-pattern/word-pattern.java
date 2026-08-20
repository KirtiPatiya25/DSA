class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2= new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(word)){
                    return false;
                }
            }

            if(map2.containsKey(word)){
                if(map2.get(word) != ch){
                    return false;
                }
            }
            map1.put(ch, word);
            map2.put(word, ch);
        }
        return true;
    }
}