class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Build frequency arrays
        for (int i = 0; i < n; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (java.util.Arrays.equals(s1Count, windowCount)) {
            return true;
        }

        // Slide the window
        for (int i = n; i < m; i++) {
            windowCount[s2.charAt(i) - 'a']++;           // add new char
            windowCount[s2.charAt(i - n) - 'a']--;       // remove old char

            if (java.util.Arrays.equals(s1Count, windowCount)) {
                return true;
            }
        }

        return false;
    }
}