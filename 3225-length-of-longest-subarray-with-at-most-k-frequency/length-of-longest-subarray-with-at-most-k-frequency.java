class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0,e = 0,s=-1;
        Map<Integer,Integer> m = new HashMap<>();
        while(e < nums.length){
            m.put(nums[e],m.getOrDefault(nums[e],0)+1);
            while(m.get(nums[e]) > k){
                s++;
                m.put(nums[s],m.get(nums[s]) - 1);
            }
            ans = Math.max(ans,e - s);
            e++;
        }
        return ans;
    }
}