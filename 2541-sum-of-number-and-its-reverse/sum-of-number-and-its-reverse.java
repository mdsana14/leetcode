class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
            StringBuilder s = new StringBuilder(String.valueOf(i));
            int r = Integer.parseInt(s.reverse().toString());
            if((i + r) == num){
                return true;
            }
        }
        return false;
    }
}