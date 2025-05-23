class Solution {
    public int maxProfit(int[] prices) {
        int minProfit=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            minProfit=Math.min(minProfit,prices[i]);

            int current=prices[i]-minProfit;
            maxProfit=Math.max(current,maxProfit);
        }
        return maxProfit;
    }
}