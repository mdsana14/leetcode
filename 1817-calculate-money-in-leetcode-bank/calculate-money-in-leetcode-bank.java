class Solution {
    public int totalMoney(int n) {
        int m = 1;
        int sum = 0;
        while(n > 0){
            for(int i=0;i<Math.min(n,7);i++){
                sum += m + i;
            }
            n -= 7;
            m++;
        }
        return sum;
    }
}