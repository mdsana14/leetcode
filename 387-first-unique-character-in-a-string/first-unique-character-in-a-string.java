class Solution {
    public int firstUniqChar(String s) {
        int[] c = new int[26];
        for(char ch : s.toCharArray()){
            c[ch -'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(c[ch-'a'] == 1) return i;
        }
        return -1;
    }
}