class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        UFDS ds = new UFDS(edges.length);
        int[] res = new int[2];
        for(int[] r : edges){
            int x = r[0];
            int y = r[1];
            if(!ds.union(x,y)){
                res[0] = x;
                res[1] = y;
            }
        }
       return res;
    }
}
class UFDS{
    int n;
    int[] p;
    public UFDS(int n){
        this.n = n;
        p = new int[n+1];
        for(int i = 0;i<n+1; i++){
             p[i] = i;
        }
    }
    int find(int x){
        if(x == p[x])
            return x;
        return p[x] = find(p[x]);
    }
    boolean union(int x,int y){
        int lx = find(x);
        int ly = find(y);
        if(lx == ly) return false;
        p[ly] = lx;
        return true;
    }
}