class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] s = new int[n];
        s[0] = nums[0];
        for(int i=1;i<n;i++){
            s[i] = s[i-1] + nums[i];
        }
        return s;
    }
}