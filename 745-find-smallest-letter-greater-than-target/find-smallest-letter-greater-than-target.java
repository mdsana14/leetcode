class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char r = letters[0];
        for(char c : letters){
            if((c - 'a') > (target - 'a')){
                r = c;
                break;
            }
        }
        return r;
    }
}