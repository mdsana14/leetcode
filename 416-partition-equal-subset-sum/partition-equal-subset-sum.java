class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        if(sum % 2 != 0) return false;
        int n = sum / 2;
        int l = nums.length;
        int[][] dp = new int[l+1][n+1];
        for(int j = 0;j<=l;j++){
            dp[j][0] = 1;
        }
        for(int i=1;i<=l;i++){
            for(int j=1;j<=n;j++){
                int in =0,ex=0;
                ex = dp[i-1][j];
                if(nums[i-1] <= j){
                    in = dp[i-1][j-nums[i-1]];
                }
                dp[i][j] = Math.min(1,in +  ex);
            }
        }
        if(dp[l][n] != 0){
            return true;
        }
        return false;

    }
}