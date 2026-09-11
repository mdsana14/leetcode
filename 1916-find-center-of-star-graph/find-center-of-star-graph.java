class Solution {
    public int findCenter(int[][] edges) {
        int[] x = edges[0];
        int[] y = edges[1];
        return x[0] == y[0] || x[0] == y[1] ? x[0] : x[1];
    }
}