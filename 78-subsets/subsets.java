class Solution {
    List<List<Integer>> r = new ArrayList<>();
    List<Integer> t = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
            bt(nums,0);
            return r;
    }
    private void bt(int[] nums,int id){
        r.add(new ArrayList<>(t));
        for(int i=id;i<nums.length;i++){
            t.add(nums[i]);//add
            bt(nums,i+1);//backtrack
            t.remove(t.size() - 1);//undo
        }
    }
}