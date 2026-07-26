class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int r1 = nums[nums.length -1] * nums[nums.length-2] * nums[nums.length-3];
        int r2 = nums[0] * nums[1] * nums[nums.length-1];
        return Math.max(r1,r2);
        
    }
}