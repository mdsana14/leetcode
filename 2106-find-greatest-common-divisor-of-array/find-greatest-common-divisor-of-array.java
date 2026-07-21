class Solution {
    public int findGCD(int[] nums) {
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            mn = Math.min(mn,nums[i]);
            mx = Math.max(mx,nums[i]);
        }
        int r = 0;
        for(int i=1;i<=mn;i++){
            if(mn % i == 0 && mx % i == 0){
                r = i;
            }
        }
        return r;
    }
}