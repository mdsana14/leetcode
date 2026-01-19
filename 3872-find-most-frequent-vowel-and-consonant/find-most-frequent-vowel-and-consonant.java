class Solution {
    public int maxFreqSum(String s) {
        int[] v = new int[10];
        int[] f = new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'a') v[0]++;
            else if(c == 'e') v[1]++;
            else if(c == 'i') v[2]++;
            else if(c == 'o') v[3]++;
            else if(c == 'u') v[4]++;
            else f[c - 'a']++;
        }
        int m1 = 0;
        for(int i=0;i<v.length;i++){
            m1 = Math.max(m1,v[i]);
        }
        
        int m2 = 0;
        for(int i=0;i<f.length;i++){
            m2 = Math.max(m2,f[i]);
        }
        return (m1+m2);
    }
}