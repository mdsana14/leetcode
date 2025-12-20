class Solution {
    public boolean isValid(String s) {
        Stack<Character> r = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '('){
                r.push(')');
            }
            else if(c == '['){
                r.push(']');
            }
            else if(c == '{'){
                r.push('}');
            }
            else if(r.isEmpty() || r.pop() != c){
                return false;
            }
        }
        return r.isEmpty();
    }
}