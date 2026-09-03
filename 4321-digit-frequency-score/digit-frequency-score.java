class Solution {
    public int digitFrequencyScore(int n) {
        int r = 0;
        while(n > 0){
            int x = n % 10;
            r += x;
            n /= 10;
        }
        return r;
    }
}