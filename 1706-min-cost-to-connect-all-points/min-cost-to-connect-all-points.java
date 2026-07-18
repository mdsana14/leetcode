class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<Edge> alledges = new ArrayList<>(); 
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int x1 = points[i][0];
                int x2 = points[j][0];
                int y1 = points[i][1];
                int y2 = points[j][1];
                int w=Math.abs(x1-x2)+Math.abs(y1-y2);
                alledges.add(new Edge(i,j,w));
            }
            }
            Collections.sort(alledges,(e1,e2)->{
                return e1.w-e2.w;
            });
            UFDS g = new UFDS(n);
            int min=0,sel=0;
            for(Edge e:alledges)
            {
                if(g.union(e.u,e.v)){
                    min+=e.w;
                    sel++;
                }
                    if(sel==n-1){
                        break;
                    }
                
            }
            


        
        return min;
    }
}
    class Edge{
        int u,v,w;
        public Edge(int u,int v,int w)
        {
           this.u = u;
           this.v = v;
           this.w = w;
        }
    }
    class UFDS{
        int n;
        int[] p;
        public UFDS(int n){
            this.n = n;
            p = new int[n];
            for(int i=0;i<n;i++){
                p[i] = i;
            }
        }
         int find(int x){
            if(x == p[x])return x;
            return p[x] = find(p[x]);
        }
         boolean union(int x,int y){
            int lx = find(x);
            int ly = find(y);
            if(lx == ly)return false;
            p[ly] = lx;
            return true;
        }
    }
