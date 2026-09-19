class Solution {
    static int lpf(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return i;
            }
        }
        return n;
    }
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer>  s = new HashSet<>();
        for(int x : nums){
        while(x > 1){
            s.add(lpf(x));
            x = x / lpf(x);
        }
        }
        return s.size();
    }
}