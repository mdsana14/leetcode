class Solution {
    public int findLucky(int[] arr) {
        int[] f = new int[501];
        for(int x : arr){
            f[x]++;
        }
        for(int i=500;i>0;i--){
            if(i == f[i]){
                return i;
            }
        }
        return -1;
    }
}