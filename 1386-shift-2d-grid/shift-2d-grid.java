class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;//3
        int n = grid[0].length;//3
        int to = m * n;//6
        k = k % to;// 1 % 6 = 1
        int[][] t = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              int id = i * n + j;//0 * 3 + 0 = 0
              int nid = (id + k) % to;//(0 +1) % 6 = 1
              int x = nid /n;// 1/3 = 0
              int y = nid % n;//1%3 = 1
              t[x][y] = grid[i][j];//t[0][1] = grid[0][0] => 
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