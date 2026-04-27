class NumArray {
    int[] r;
    public NumArray(int[] nums) {
        int n = nums.length;
        r = new int[n];
        r[0] = nums[0];
        for(int i=1;i<n;i++){
           r[i] = r[i-1]+ nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return r[right];
        }
        return r[right] - r[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */