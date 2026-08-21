class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        if(sum % k != 0)return false;
        int t = sum / k;
        Arrays.sort(nums);
        if (nums[nums.length - 1] > t) return false;
        boolean[] b = new boolean[nums.length];
        return helper(nums,nums.length-1,0,t,k,b);
    }
    static boolean helper(int[] a,int i,int sum,int t,int k,boolean[] b){
        if(sum == t){
            k--;
            if(k == 0){
                return true;
            }
            return helper(a,a.length-1,0,t,k,b);
        }
        if(i < 0){
            return false;
        }
        if(!b[i] && sum + a[i] <= t){
            b[i] = true;
            if(helper(a,i-1,sum + a[i],t,k,b)){
            return true;
            }
            b[i] = false;
        }
        if (helper(a, i - 1, sum, t, k, b)) {
            return true;
        }
        return false;
    }
}