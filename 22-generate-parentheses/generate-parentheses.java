class Solution {
    StringBuilder s;
    List<String> p;
    public List<String> generateParenthesis(int n) {
        s = new StringBuilder();
        p = new ArrayList<>();
        helper(n,0,0,s);
        return p;
    }
    public void helper(int n,int l,int r,StringBuilder s) {
        if(s.length() == (2 * n)){
            p.add(s.toString());
            return;
        }
        if(l < n){
            s.append("(");
            helper(n,l+1,r,s);
            s.setLength(s.length() -1);
        }
        if(r < l){
            s.append(")");
            helper(n,l,r+1,s);
            s.setLength(s.length() -1);
        }
       
        
    }
}