class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n = prices.length;
        int sum = prices[0];
        for(int i=1;i<n;i++){
            sum = prices[i] + prices[i-1];
            if(money >= sum){
                return (money - sum);
            }
        }
       return money;
    }
}