class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int st =0,e=0,min=nums.length,n=nums.length;
        long sum =0;
        for(e=0;e<n;e++){
            sum += nums[e];
            while(st < n && sum >= target){
                min = Math.min(min,e- st +1);
                sum -= nums[st];
                st++;
            }
        }
        long r =0;
        for(int i=0;i<n;i++){
            r += nums[i];
        }
        if(r < target){
            return 0;
        }
        return min;
    }
}