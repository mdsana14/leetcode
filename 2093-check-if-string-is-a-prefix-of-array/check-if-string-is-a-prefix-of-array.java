class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder st = new StringBuilder();
        int n = s.length();
        for(String w : words){
            if(st.length() != n){
             st.append(w);
            }
        }
        if(s.equals(st.toString())){
            return true;
        }
        return false;

    }
}