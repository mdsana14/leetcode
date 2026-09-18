class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] d = new int[n][n];
        int[][] m = new int[n][n];
        for(int[] e : edges)
        {
            int u = e[0],v = e[1],w = e[2];
            m[u][v] = m[v][u] = w;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    d[i][j] = 0;
                }
                else if(m[i][j] == 0){
                    d[i][j] = Integer.MAX_VALUE;
                }
                else{
                    d[i][j] = m[i][j];
                }
            }
        }
        for(int x=0;x<n;x++){
            for(int s=0;s<n;s++){
                for(int e=0;e<n;e++){
                    if(d[s][x] != Integer.MAX_VALUE && d[x][e] != Integer.MAX_VALUE){
                         if(d[s][x]+d[x][e] < d[s][e]){
                            d[s][e] = d[s][x] + d[x][e];
                         }
                    }
                }
            }
        }
        int r = 0,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int c = 0;
            for(int j=0;j<n;j++){
               if(d[i][j] <= distanceThreshold){
                  c++;
               }
            }
            if(c <= min){
                min = c;
                r = i;
            }
        }
        return r;
    }
}