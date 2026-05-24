class Solution {

    public int maximalSquare(char[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] dp = new int[rows][cols];

        int maxSide = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                // Current cell is 1
                if (matrix[i][j] == '1') {

                    // First row or first column
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    }

                    // Other cells
                    else {

                        dp[i][j] = Math.min(
                                dp[i - 1][j],
                                Math.min(
                                    dp[i][j - 1],
                                    dp[i - 1][j - 1]
                                )
                            ) + 1;
                    }

                    // Update answer
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }

        return maxSide * maxSide;
    }
}



