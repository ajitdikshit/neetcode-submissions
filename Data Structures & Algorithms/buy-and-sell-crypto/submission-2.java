class Solution {
    public int maxProfit(int[] prices) {
        int buy;
        int sell;
        int maxprofit=0;
        for (int x=0;x<prices.length-1;x++){
            sell=prices.length-1;;
            buy=x;
            while(sell>buy){
                maxprofit=Math.max(maxprofit,(prices[sell]-prices[buy]));
                sell--;
            }
        }
        return maxprofit;
    }
}
