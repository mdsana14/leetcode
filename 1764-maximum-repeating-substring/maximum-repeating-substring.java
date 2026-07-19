class Solution {
    public int maxRepeating(String sequence, String word) {
        int c = 0;
        String curr = word;
        while(sequence.contains(curr)){
            c++;
            curr += word;
        }
        return c;
    }
}