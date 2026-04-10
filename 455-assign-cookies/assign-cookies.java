class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // children
        int j = 0; // cookies
        int count = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                i++; // child satisfied
            }
            j++; // move to next cookie
        }

        return count;
    }
}