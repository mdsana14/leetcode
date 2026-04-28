class Solution {
    public int majorityElement(int[] nums) {
       int cd = 0,c=0;
       for(int n : nums){
        if(c == 0){
            cd = n;
        }
        if(n == cd){
            c++;
        }
        else{
            c--;
        }
       }
       return cd;
    }
}