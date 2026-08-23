class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int l = n /2;
        int ls = 0,rs = 0;
        int lc = 0,rc= 0;
        for(int i=0;i<l;i++){
            if(num.charAt(i) == '?'){
                lc++;
            }else{
             ls += num.charAt(i) - '0';
            }
        }
        for(int i=l;i<n;i++){
            if(num.charAt(i) == '?'){
                rc++;
            }else{
             rs += num.charAt(i) - '0';
            }
        }
        if((lc + rc) % 2 == 1){
            return true;
        }
        return 2 * (ls - rs) != 9 * (rc - lc);
    }
}