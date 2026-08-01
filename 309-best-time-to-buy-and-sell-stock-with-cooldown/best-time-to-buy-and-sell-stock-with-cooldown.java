class Solution {
    int [][] dp;
    private int solve(int[] prices, int i, int f){
        if(i>=prices.length) return 0;

        if(dp[i][f] != -1){
            return dp[i][f];
        }
        if(f==1){
            int buy = -prices[i] + solve(prices,i+1, 0);
            int notBuy = solve(prices,i+1, 1);
            return dp[i][f] = Math.max(buy, notBuy);
        }
        else{
            int sell = prices[i] + solve(prices,i+2, 1);
            int notSell = solve(prices,i+1, 0);
            return dp[i][f] = Math.max(sell, notSell);
        }
    }
    public int maxProfit(int[] prices) {
        dp = new int[prices.length][2];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        
        return solve(prices, 0, 1);
    }
}