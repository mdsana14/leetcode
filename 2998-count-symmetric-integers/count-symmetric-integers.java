class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int r = 0;
        for(int i=low;i<=high;i++){
            String s = String.valueOf(i);
            if(s.length() % 2 == 1){
                continue;
            }
            int fh = 0,sh = 0;
            for(int j=0;j<s.length() /2;j++){
                fh += s.charAt(j) - '0';
            }
            for(int j=s.length()/2;j<s.length();j++){
                sh += s.charAt(j) - '0';
            }
            if(fh == sh){
                r++;
            }
        }
        
        return r;
    }
}