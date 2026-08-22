class Solution {
    public int createSortedArray(int[] instructions) {
        int max = 100000;
        long r = 0;
        ST ob = new ST(max);
        for(int x : instructions){
            long a = ob.range(0,x-1);
            long b = ob.range(x+1,max);
            r = r + Math.min(a,b);
            r %= 1000000007;
            ob.freq(x);
        }
        return (int)r;
    }
}
class ST{
    long[] st;int max = 0;
    public ST(int max){
        st = new long[4 * max];
        this.max = max;
        
    }
    long range(int l,int r){
       return rangehelp(0,0,max,l,r);
    }
    long rangehelp(int idx,int ss,int se,int qs,int qe){
        if(qe < ss || qs > se)return 0;
        if(ss >= qs && se <= qe){
            return st[idx];
        }
        int m = (ss + se) /2;
        long ls = rangehelp(2* idx + 1,ss,m,qs,qe);
        long rs = rangehelp(2* idx + 2,m+1,se,qs,qe);
        return ls + rs;
    }
    void freq(int x){
        int idx = 0,ss = 0,se = max;
        while(ss < se){
            int m = (ss + se) / 2;
            if(x <= m){
                idx = 2 * idx +1;
                se = m;
            }
            else{
                idx = 2 * idx +2;
                ss = m + 1;
            }
        }
        while(true){
            st[idx] += 1;
            if(idx == 0){
                break;
            }
            idx = (idx - 1) /2;
        }
    }
}