class Solution {
    public boolean isBalanced(String num) {
        int x = 0;
        int y = 0;
        char[] t = num.toCharArray();
        for(int i = 0;i < num.length();i++){
            if(i % 2 == 0){
                x += t[i] - '0';
            }
            else{
                y += t[i] - '0';
            }
        }
        if(x == y){
            return true;
        }
        return false;
    }
}