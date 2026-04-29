class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int l =0,max=0;
        for(int r=0;r<s.length();r++){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}