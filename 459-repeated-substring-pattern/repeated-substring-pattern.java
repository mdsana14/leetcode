class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int k=1;k<=n/2;k++){
        if(n % k != 0) continue;
        String x = s.substring(0,k);
        int m = x.length();
        int a = 0;
        boolean r = true;
        while(a <= n - m){
            int i=a;int j = 0;
            while(j < m){
                if(s.charAt(i) == x.charAt(j)){
                    i++;
                    j++;
                }
                else{
                   r = false;
                   break;
                } 
            }
            a += k;
        }
        if(r){
            return true;
        }
        }
        return false;
    }
}