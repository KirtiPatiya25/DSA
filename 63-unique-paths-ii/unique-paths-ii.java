// class Solution {
//     private int solve(int[][] Grid, int i, int j, int[][] dp) {
//         int n = Grid.length;
//         int m = Grid[0].length;
//         if (i == n-1 && j == m-1)
//             return 1;

//         if (i>=n || j>=m)
//             return 0;

//         if (Grid[i][j] == 1)
//             return 0;

//         if(dp[i][j] != -1){
//             return dp[i][j];
//         }

//         int right = solve(Grid, i, j + 1, dp);
//         int down = solve(Grid, i + 1, j, dp);

//         return dp[i][j] = right + down;

//     }

//     public int uniquePathsWithObstacles(int[][] Grid) {
//         int n = Grid.length;
//         int m = Grid[0].length;

//         int[][] dp = new int[n][m];

//         for(int i=0; i<n; i++){
//             Arrays.fill(dp[i], -1);
//         }
//         return solve(Grid, 0, 0, dp);

//     }
// }

class Solution {

    private int solve(int[][] grid, int i, int j, int[][] dp) {
        int n = grid.length;
        int m = grid[0].length;

        // Out of bounds
        if (i >= n || j >= m)
            return 0;

        // Obstacle
        if (grid[i][j] == 1)
            return 0;

        // Destination reached
        if (i == n - 1 && j == m - 1)
            return 1;

        // Already computed
        if (dp[i][j] != -1)
            return dp[i][j];

        int right = solve(grid, i, j + 1, dp);
        int down = solve(grid, i + 1, j, dp);

        return dp[i][j] = right + down;
    }

    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(grid, 0, 0, dp);
    }
}