class Solution {
    boolean[] b;
    public boolean checkPrimeFrequency(int[] nums) {
        int max = 0;
        for(int x : nums){
            max = Math.max(max,x);
        }
        int[] f = new int[max+1];
        for(int x :nums){
            f[x]++;
        }
        for(int i=0;i<f.length;i++){
            if(prime(f[i])){
                return true;
            }
        }
        return false;
    }
    boolean prime(int n){
       if(n < 2)return false;
       b = new boolean[n+1];
       Arrays.fill(b,true);
       b[0] = false;
       b[1] = false;
       for(int i=2;i<=Math.sqrt(n);i++){
        if(b[i]){
            for(int j=i*i;j<b.length;j+=i){
                b[j] =  false;
            }
        }
       }
       return b[n];
    }
}