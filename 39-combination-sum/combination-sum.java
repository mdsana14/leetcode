class Solution {
    List<List<Integer>> r = new ArrayList<>();
    List<Integer> t = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        bt(0,candidates,target);
        return r;
    }
    private void bt(int id,int[] candidates,int target){
        if(target == 0){
            r.add(new ArrayList<>(t));
            return ;
        }
        for(int i=id;i<candidates.length;i++){
            if(candidates[i] > target) continue;
            t.add(candidates[i]);
            bt(i,candidates,target - candidates[i]);
            t.remove(t.size() - 1);
        }
    }
}