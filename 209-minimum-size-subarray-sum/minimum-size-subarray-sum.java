class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int st =0,e=0,min=nums.length + 1,n=nums.length;
        long sum =0;
        for(e=0;e<n;e++){
            sum += nums[e];
            while(sum >= target){
                min = Math.min(min,e- st +1);
                sum -= nums[st];
                st++;
            }
        }
        return (min == n +1)?0:min;
    }
}