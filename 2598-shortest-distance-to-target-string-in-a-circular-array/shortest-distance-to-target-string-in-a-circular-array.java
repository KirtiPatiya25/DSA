class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int straightDist = Math.abs(i - startIndex);
                int circularDist = n - straightDist;

                result = Math.min(result, Math.min(straightDist, circularDist));
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}