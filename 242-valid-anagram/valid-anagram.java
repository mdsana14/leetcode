class Solution {
    public boolean isAnagram(String s, String t) {
       boolean r = false;
       char[] c1 = s.toCharArray();
       char[] c2 = t.toCharArray();
       Arrays.sort(c1);
       Arrays.sort(c2);
       if(Arrays.equals(c1,c2)){
        r = true;
       }
       return r;
    }
}