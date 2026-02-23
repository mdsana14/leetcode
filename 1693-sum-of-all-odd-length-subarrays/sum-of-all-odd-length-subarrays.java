class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int c = 0;
        int l = arr.length;
        for(int i=1;i<=l;i+=2){
            for(int j=0;j<=l-i;j++){
                for(int k = j;k<j+i;k++){
                    c += arr[k];
                }
            }
        }
        return c;
    }
}