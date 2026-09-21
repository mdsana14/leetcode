class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder s = new StringBuilder();
        StringBuilder r = new StringBuilder();
        int id = word.indexOf(ch);
        for(int i=0;i<=id;i++){
            s.append(word.charAt(i));
        }
        for(int i=id+1;i<word.length();i++){
            r.append(word.charAt(i));
        }
        s.reverse();
        String res = s.toString() + r.toString();
        return res;
    }
}