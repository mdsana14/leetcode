class Solution
 {
    public int[] resultArray(int[] nums)
    {
        int n = nums.length;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        for(int i = 2;i<n;i++){
          if(a.get(a.size() -1) > b.get(b.size() -1)){
            a.add(nums[i]);
          }
          else{
            b.add(nums[i]);
          }
        }
        int[] r = new int[n];
        int x = 0;
        for(int num : a){
            r[x++] = num;
        }
        for(int num : b){
            r[x++] = num;
        }
        return r;
    }
}