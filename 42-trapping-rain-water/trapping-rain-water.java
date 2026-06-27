class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] l = new int[n];
        l[0] = height[0];
        for(int i=1;i<n;i++){
            l[i] = Math.max(height[i],l[i-1]);
        }
        int[] r = new int[n];
        r[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            r[i] = Math.max(r[i+1],height[i]);
        }
        int res = 0;
        for(int i=0;i<n;i++){
            int d = Math.min(l[i],r[i]);
            int x = d - height[i];
            res += x;
        }
        return res;
    }
}