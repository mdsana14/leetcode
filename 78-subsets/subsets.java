class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        for(int i=0;i<(1 << nums.length);i++){
            List<Integer> l2 = new ArrayList<>();
            for(int k=0;k<nums.length;k++){
                if(( i & (1 << k))!= 0){
                    l2.add(nums[k]);
                }
            }
            l1.add(l2);
        }
        return l1;
    }
}