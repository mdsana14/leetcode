class Solution {
    public int fib(int n) {
        if(n == 0)return 0;
        if(n == 1)return 1;
        int r = 0,s = 1;
        for(int i=2;i<=n;i++){
            int t = s;
            s = r+s;
            r = t;
        }
        return s;
    }
}