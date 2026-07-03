class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int[] f = new int[101];
        int c = 0;
        for(int x : nums){
            c += f[x]++;
            
        }
        return c;
    }
}