class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int r = k;
        int n = nums.length;
        int i  = 0;
        while(true){
        while(i < n && nums[i] < r) i++;
        if(i >= n || nums[i] != r){
            return r ;
        }
        r += k;
        }
    }
}