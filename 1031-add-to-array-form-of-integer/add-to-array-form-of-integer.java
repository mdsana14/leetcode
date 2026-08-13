class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int x = k;
        List<Integer> r = new ArrayList<>();
        int i = num.length;
        while(--i >= 0 || x > 0){
            if(i >= 0){
              x += num[i];
            }
            r.add(x % 10);
            x /= 10;  
        }
        Collections.reverse(r);
        return r;
    }
}