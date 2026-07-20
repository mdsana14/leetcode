class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int to = m *n;
        k = k % to;
        int[][] t = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              int id = i * n + j;
              int nid = (id + k) % to;
              int x = nid /n;
              int y = nid % n;
              t[x][y] = grid[i][j];
            }
        }
        List<List<Integer>> r = new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<n;j++){
              l.add(t[i][j]);
            }
            r.add(l);
        }
        return r;
    }
}