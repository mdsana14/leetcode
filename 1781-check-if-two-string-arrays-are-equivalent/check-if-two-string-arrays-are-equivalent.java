class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s = new StringBuilder();
        StringBuilder r = new StringBuilder();
        for(String x : word1){
           s.append(x);
        }
        for(String x : word2){
           r.append(x);
        }
        return s.toString().equals(r.toString());
    }
}