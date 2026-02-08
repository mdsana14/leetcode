class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for(int n:arr1){
            boolean  v = true;
            int l = n - d;
            int r = n + d;
            for(int x : arr2){
                if(x >= l && x <= r){
                    v = false;
                    break;
                }
            }
            if(v){
                ans++;
            }
        }
        return ans;
    }
}