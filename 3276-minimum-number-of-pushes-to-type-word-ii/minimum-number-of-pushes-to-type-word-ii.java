class Solution {
    public int minimumPushes(String word) {
        int[] f = new int[26];
        for(char c : word.toCharArray()){
            f[c - 'a']++;
        }
        Arrays.sort(f);
        int[] sf = new int[26];
        for(int i=0;i<26;i++){
            sf[i] = f[25 - i];
        }
        int ans = 0;
        for(int i=0;i<26;i++){
            if(sf[i] == 0) break;
            ans += ((i / 8) + 1) * sf[i];
        }
        return ans;
    }
}