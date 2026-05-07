class Solution {
    public int countOdds(int low, int high) {
        int c = (high - low) / 2;
            if(low % 2 == 1 || high % 2 ==1){
                c++;
            }
        return c;
    }
}