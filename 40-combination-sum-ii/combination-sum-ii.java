class Solution {
    List<List<Integer>> r = new ArrayList<>();
    List<Integer> t = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        bt(0,candidates,target);
        return r;
    }
    private void bt(int id,int[] c,int k){
        if(k==0){
            r.add(new ArrayList<>(t));
            return;
        }
        for(int i=id;i<c.length;i++){
            if(c[i] > k) continue;
            if(i > id && c[i] == c[i-1]) continue;
            t.add(c[i]);
            bt(i+1,c,k - c[i]);
            t.remove(t.size()-1);
        }
    }
}