class Solution {
    List<List<Integer>> r =  new ArrayList<>();
    List<Integer>  t= new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        bt(1,k,n);
        return r;
    }
    private void bt(int id,int k,int n){
        if(n == 0 && t.size() == k){
            r.add(new ArrayList<>(t));
            return;
        }
        for(int i=id;i<=9;i++){
            if(i > n)continue;
            t.add(i);
            bt(i + 1,k,n - i);
            t.remove(t.size() - 1);
        }
    }
}