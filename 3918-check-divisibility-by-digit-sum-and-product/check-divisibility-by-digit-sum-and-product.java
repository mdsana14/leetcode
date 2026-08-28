class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int dg = 0;
        int dp = 1;
        while(num != 0){
            int x = num % 10;
            dg += x;
            dp *= x;
            num /= 10;
        }
        int d = dg + dp;
        if(n % d == 0){
            return true;
        }
        return false;
    }
}