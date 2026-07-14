class Solution {
    public String mergeAlternately(String word1, String word2) {
        String r = "";
        StringBuilder s = new StringBuilder();
        int i=0,j=0;
        while(i < word1.length() && j < word2.length()){
            s.append(word1.charAt(i));
            i++;
            s.append(word2.charAt(j));
            j++;
        }
        while(word1.length() > word2.length() && i < word1.length()){
            s.append(word1.charAt(i));
            i++;
        }
        while(word1.length() < word2.length() && j < word2.length()){
            s.append(word2.charAt(j));
            j++;
        }
        return s.toString();
    }
}