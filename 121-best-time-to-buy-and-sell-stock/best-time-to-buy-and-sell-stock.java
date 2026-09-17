class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){
            buy = Math.min(buy, prices[i]);
            int profit = prices[i] - buy;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}