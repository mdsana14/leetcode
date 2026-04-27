class NumArray {
    private int[] r;
    public NumArray(int[] nums) {
        int n = nums.length;
        r = new int[n+1];
        for(int i=0;i<n;i++){
           r[i+1] = r[i]+ nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return r[right + 1] - r[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */