class Solution {
    private int solve(char[] arr1, char[] arr2, int i, int j, int[][] dp) {
        if (i == arr1.length || j == arr2.length)
            return 0;

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(arr1[i] == arr2[j]){
            return dp[i][j] = 1+solve(arr1, arr2, i+1, j+1, dp); 
        }
        int match = solve(arr1, arr2, i + 1, j, dp);
        int notMatch = solve(arr1, arr2, i, j + 1, dp);

        return dp[i][j] = Math.max(match, notMatch);
    }

    public int longestCommonSubsequence(String text1, String text2) {

        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();

        int[][] dp = new int[arr1.length][arr2.length];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return solve(arr1, arr2, 0, 0, dp);
    }
}