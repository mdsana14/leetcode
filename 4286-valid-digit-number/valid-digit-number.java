class Solution {
    public boolean validDigit(int n, int x) {
        String t = String.valueOf(n);
        String s = String.valueOf(x);
        if(t.contains(s) && t.charAt(0) != s.charAt(0)){
            return true;
        }
        return false;
    }
}