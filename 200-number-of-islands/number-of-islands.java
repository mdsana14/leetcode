class Solution {
    char[][] a;
    public int numIslands(char[][] grid) {
        int l = 0;
        a= grid;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j] == '1'){
                    l++;
                    sink(i,j);
                }
            }
        }
        return l;
    }
     int sink(int i,int j){
        if(i<0 || j < 0|| i == a.length || j == a[i].length||a[i][j] == '0'){
            return 0;
        }
        a[i][j] = '0';
        sink(i+1,j);
        sink(i -1,j);
        sink(i,j+1);
        sink(i,j -1);
        return 1;
    }
    
}