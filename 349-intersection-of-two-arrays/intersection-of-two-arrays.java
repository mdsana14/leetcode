class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s =  new HashSet<>();
        Set<Integer> r =  new HashSet<>();
        for(int x : nums1){
            s.add(x);
        }
        for(int x : nums2){
            if(s.contains(x)){
              r.add(x);
            }
        }
        int[] a = new int[r.size()];
        int i =0;
        for(int x : r){
            a[i++] = x;
        }
        return a;
    }
}