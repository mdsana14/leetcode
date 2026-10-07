class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         int n = matrix.length;
         int m = matrix[0].length;
         List<Integer> r = new ArrayList<>();
         for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<m;j++){
                min = Math.min(min,matrix[i][j]);
            }
            r.add(min);
         }
         List<Integer> c = new ArrayList<>();
         for(int i=0;i<m;i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0;j<n;j++){
                max = Math.max(max,matrix[j][i]);
            }
            c.add(max);
         }
         List<Integer> l = new ArrayList<>();
         for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
               if(matrix[i][j] == r.get(i) && matrix[i][j] == c.get(j)){
                 l.add(matrix[i][j]);
               }
            }
         }
         return l;
    }
}