class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] r = s.split("\\s+");
        StringBuilder st = new StringBuilder();
        for(int i=r.length-1;i>=0;i--){
            st.append(r[i]);
            if(i != 0){
                st.append(" ");
            }
        }
        return st.toString();
    }
}