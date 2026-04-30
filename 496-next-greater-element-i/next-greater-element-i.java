class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int x : nums2){
            while(!s.isEmpty() && s.peek() < x){
                m.put(s.pop(),x);
            }
            s.push(x);
        }
        while(!s.isEmpty()){
            m.put(s.pop(),-1);
        }
        int[] r = new int[nums1.length];
        for(int i=0;i<r.length;i++){
            r[i] = m.get(nums1[i]);
        }
        return r;
    }
}