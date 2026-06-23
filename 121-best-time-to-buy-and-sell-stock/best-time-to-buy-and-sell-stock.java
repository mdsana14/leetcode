class Solution {
    public int maxProfit(int[] prices) {
       int m = 0;
       int b = prices[0];
       for(int i=0;i<prices.length;i++){
           if(prices[i] < b){
             b = prices[i];
           }
           else if(prices[i]-b > m){
            m = prices[i] - b;
           }
       }
       return m;
    }
}