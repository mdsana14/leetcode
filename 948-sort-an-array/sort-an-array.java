class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length - 1;
        mergesort(nums,0,n);
        return nums;
    }
    static void mergesort(int[] nums,int l,int h){
        if(l < h){
        int m = l + (h - l) / 2;
        mergesort(nums,l,m);
        mergesort(nums,m + 1,h);
        merge(nums,l,m,h);
        }
    }
    static void merge(int[] nums,int l,int m,int h){
        int i=l,j=m+1,k=0;
        int[] t = new int[h-l + 1];
        while(i <= m && j <= h){
            if(nums[i] <= nums[j]){
             t[k++] = nums[i++];
        }else{
            t[k++] = nums[j++];
        }
        }
        while(i <= m){
            t[k++] = nums[i++];
        }
        while(j <= h){
            t[k++] = nums[j++];
        }
        for(i=l,k=0;i <= h;k++,i++){
            nums[i] = t[k];
        }
    }
}