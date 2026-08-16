class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int l = Math.max(1,n - k);
        int r = n + k;
        int res = 0;
        for(int i =l;i<=r;i++){
            if((n & i) == 0){
                res += i;
            }
        }
        return res;
    }
}