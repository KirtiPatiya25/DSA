class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int expsum = 0;
        int actualSum = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                actualSum += grid[i][j];

                if(set.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        expsum = (n*n) * (n*n+1) / 2;
        ans[1] = expsum + ans[0] - actualSum;
        
        return ans;
    }
}