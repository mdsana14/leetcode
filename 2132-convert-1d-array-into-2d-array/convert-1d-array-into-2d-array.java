class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] a = new int[m][n];
        if((m*n) == original.length){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    int x = original[i * n + j];
                    a[i][j] = x;
                }
            }
        }
        else{
            return new int[0][0];
        }
        return a;
    }
}