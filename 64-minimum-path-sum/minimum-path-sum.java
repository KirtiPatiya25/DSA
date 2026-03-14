class Solution {
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }

        return paths(0,0,m,n,grid,dp);
    }

    private int paths(int row, int col, int m, int n, int[][] grid, int[][] dp){

        if(row>=m || col>=n) return Integer.MAX_VALUE;

        if(row==m-1 && col==n-1) return grid[row][col];

        if(dp[row][col] != -1) return dp[row][col];

        int right = paths(row, col+1, m, n, grid, dp);
        int down = paths(row+1, col, m, n, grid, dp);

        return dp[row][col] = grid[row][col] + Math.min(right, down);
    }
}