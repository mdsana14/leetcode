class Solution {
    List<List<Integer>> r  = new ArrayList<>();
    List<Integer> t = new ArrayList<>();
    boolean[] b;
    public List<List<Integer>> permuteUnique(int[] nums) {
        b = new boolean[nums.length];
        Arrays.sort(nums);
        bt(nums);
        return r;
    }
    private void bt(int[] n){
        if(t.size() == n.length){
            r.add(new ArrayList<>(t));
            return;
        }
        for(int i=0;i<n.length;i++){
            if(b[i])continue;
            if(i > 0 && n[i] == n[i-1] && !b[i-1]){
                continue;
            }
            b[i] = true;
            t.add(n[i]);
            bt(n);
            t.remove(t.size() - 1);
            b[i] = false;
        }
    }
}