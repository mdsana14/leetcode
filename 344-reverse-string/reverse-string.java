class Solution {
    public void reverseString(char[] s) {
        int l=0,r=s.length -1;
        while(l < r){
            char tp = s[l];
            s[l] = s[r];
            s[r]= tp;
            l++;
            r--;
        }
    }
}