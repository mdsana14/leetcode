class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;
        int[][] dp = new int[x + 1][y + 1];
        for(int i=x-1;i>=0;i--){
            for(int j=y-1;j>=0;j--){
                if(nums1[i] == nums2[j]){
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}