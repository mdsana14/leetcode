class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0;
        while(i < nums1.length){
            a.add(nums1[i]);
            i++;
        }
        i = 0;
        while(i < nums2.length){
            a.add(nums2[i]);
            i++;
        }
        Collections.sort(a);
        int n = a.size();
        double m = 0;
        if(n % 2 != 0){
            m = a.get(n / 2);
        }
        else{
             m = (a.get(n/2) + a.get((n/2) - 1)) / 2.0;
        }
        return m;   
    }
}