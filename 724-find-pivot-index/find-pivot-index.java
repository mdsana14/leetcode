class Solution {
    public int pivotIndex(int[] nums) {
        int ts = 0;
        for(int x : nums){
            ts += x;
        }
        int ls = 0;
        for(int i=0;i<nums.length;i++){
            if(ls == (ts - ls - nums[i])){
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
}