class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(k == n){
            int res = nums[0];
            for(int i=0;i<n;i++){ 
             res = Math.max(nums[i],res);
            }
            return res;
        }
        int[] f = new int[51];
        for(int x : nums){
            f[x]++;
        }
        if(k == 1){
            for(int i =50;i >= 0;--i){
                if(f[i] == 1){
                    return i;
                }
            }
            return -1;
        }
        int res = -1;
        if(f[nums[0]] == 1){
            res = Math.max(res,nums[0]);
        }
        if(f[nums[n-1]] == 1){
            res = Math.max(res,nums[n-1]);
        }
        return res;
    }
}