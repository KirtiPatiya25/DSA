class Solution {
    public String removeOccurrences(String s, String part) {

        while (s.length() > 0 && s.indexOf(part) != -1) {

            int index = s.indexOf(part);

            s = s.substring(0, index) + s.substring(index + part.length());
        }

        return s;
    }
}