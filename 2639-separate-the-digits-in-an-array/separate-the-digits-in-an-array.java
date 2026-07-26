class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> r = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            int k = 0;
            ArrayList<Integer> t = new ArrayList<>();
            while(x != 0){
                t.add(x % 10);
                x /= 10;
            }
            for(int j=t.size()-1;j>=0;j--){
                r.add(t.get(j));
            }
        }
        int[] a = new int[r.size()];
        for(int i=0;i<r.size();i++){
            a[i] = r.get(i);
        }
        return a;
    }
}