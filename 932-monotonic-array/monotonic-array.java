class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean a = true;
        boolean b = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                a = false;
            }
            else if(nums[i] > nums[i-1]){
                b = false;
            }
        }
        if(!a && !b){
            return false;
        }
        return true;

    }
}