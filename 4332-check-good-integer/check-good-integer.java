class Solution {
    public boolean checkGoodInteger(int n) {
        int num = n;
        int s = 0,ss = 0;
        while(num != 0){
            int x = num % 10;
            s += x;
            ss += (x * x);
            num /= 10;
        }
        return ((ss - s) >= 50);
    }
}