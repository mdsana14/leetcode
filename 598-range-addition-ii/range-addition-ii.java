class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int a = m;
        int b = n;
        for(int num[] : ops){
            a = Math.min(a,num[0]);
            b = Math.min(b,num[1]);
        }
        return a * b;
    }
}