class NumArray {
    int[] r;
    public NumArray(int[] nums){
        int n = nums.length;
        r = new int[n];
        r[0] = nums[0];
        for(int i=1;i<n;i++){
            r[i] = r[i-1] + nums[i];
            System.out.println(r[i]);
        }
    }
    public int sumRange(int l,int rt){
        if(l == 0){
            return r[rt];
        }
        return r[rt] - r[l-1];
    }
}
