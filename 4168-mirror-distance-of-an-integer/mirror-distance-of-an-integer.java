class Solution {
    public int mirrorDistance(int n) {
        StringBuilder s = new StringBuilder(String.valueOf(n));
        s.reverse();
        int r = Math.abs(n- Integer.parseInt(s.toString()));
        return r;
    }
}