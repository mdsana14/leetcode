class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        }
        Set<Integer> r = new HashSet<>();
        for(int n : nums){
            r.add(n);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=min;i<=max;i++){
           if(!r.contains(i)){
             res.add(i);
           }
        }
        return res;
    }
}