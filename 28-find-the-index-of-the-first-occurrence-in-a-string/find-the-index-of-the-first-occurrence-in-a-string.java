class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int s = 0;
        //int r = 0;
        while(s <= n - m){
            int i = s;
            int j = 0;
            while(j < m){
                if(haystack.charAt(i) == needle.charAt(j)){
                    i++;
                    j++;
                    if(j == m){
                       return s;
                    }
                }
                else{
                    s++;
                    break;
                }
            }
        }
        return -1;
    }
}