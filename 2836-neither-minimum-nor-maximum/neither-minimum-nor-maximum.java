class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <= 2)return -1;
        int max = nums[0];
        int min = nums[0];
        int r = -1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > max){
                r = max;
                max = nums[i];
            }
            else if(nums[i] < min){
                r = min;
                min = nums[i];
            }
            else{
                r = nums[i];
            }
        }
        return r;
    }
}