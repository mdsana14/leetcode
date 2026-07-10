class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        if(n < 3)return nums;
        List<Integer> o = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                e.add(nums[i]);
            }
            else{
                o.add(nums[i]);
            }
        }
        Collections.sort(e);
        Collections.sort(o);
        Collections.reverse(o);
        int[] r = new int[n];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                r[i] = e.get(j++);
            }
            else{
                r[i] = o.get(k++);
            }
        }
        return r;
    }
}