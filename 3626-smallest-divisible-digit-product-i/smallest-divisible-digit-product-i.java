class Solution {
    public int smallestNumber(int n, int t) {
        while(!check(n,t)){
            n++;
        }
        return n;
    }
    private boolean check(int n, int t) {
        int p = 1;
            while(n > 0){
                int a = n % 10;
                p *= a;
                n /= 10;
            if(p  == 0){
                break;
            }
            }
        
        return p % t == 0;
    }
 }
