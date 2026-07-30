class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int r = 0;
        for(int i=0;i<n;i++){
            r += (i / 8) +1;
            System.out.println(r);
        }
        return r;
        
    }
}