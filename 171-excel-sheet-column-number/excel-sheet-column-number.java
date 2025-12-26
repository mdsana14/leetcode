class Solution {
    public int titleToNumber(String columnTitle) {
        int r =0;
        for(char c : columnTitle.toCharArray()){
            r = r * 26 + (c - 'A' + 1);
        }
        return r;
    }
}