class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int num = nums[i];
            for(int j=i;j<n;j++){
                if(Math.abs(num - nums[j]) <= Math.min(num,nums[j])){
                    max = Math.max(max,num ^ nums[j]);
                }
            }
        }
        return max;
    }
}