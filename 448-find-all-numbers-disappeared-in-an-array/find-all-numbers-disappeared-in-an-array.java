class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] m = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            m[nums[i]] = true;
        }
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<m.length;i++){
            if(!m[i]){
                l.add(i);
            }
        }
        return l;
    }
}