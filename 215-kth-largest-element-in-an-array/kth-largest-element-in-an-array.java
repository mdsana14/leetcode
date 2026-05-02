class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : nums){
            p.offer(n);
        }
        while(--k > 0){
            p.poll();
        }
        return p.peek();
    }
}