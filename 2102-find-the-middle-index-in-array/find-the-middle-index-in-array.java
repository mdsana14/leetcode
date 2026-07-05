class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        int ls = 0,rs = sum;
        for(int i=0;i<nums.length;i++){
           rs -= nums[i];
           if(ls == rs){
            return i;
           } 
           ls += nums[i];
        }
        return -1;
    }
}