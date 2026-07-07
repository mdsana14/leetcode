class Solution {
    public int findClosestNumber(int[] nums) {
        int r = Integer.MAX_VALUE;
        for(int x : nums){
            if(Math.abs(x) < Math.abs(r) || x == Math.abs(r)){
                r = x;
            }
        }
        return r;
    }
}