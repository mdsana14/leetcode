class Solution {
    public int maxProduct(int[] nums) {
        int mp = nums[0];
        int minp = nums[0],r = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] < 0){
            int t = mp;
            mp = minp;
            minp = t;
            }
            mp = Math.max(nums[i],nums[i] * mp);
            minp= Math.min(nums[i],nums[i] * minp);
            r = Math.max(r,mp);
        }
        return r;
    }
}