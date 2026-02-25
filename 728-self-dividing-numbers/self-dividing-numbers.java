class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n = i;
            boolean b = true;
            while(n > 0){
                int d = n % 10;
                if(d == 0 || i % d != 0){
                    b = false;
                    break;
                }
                n /= 10;
            }
            if(b){
                l.add(i);
            }
        }
        return l;
    }
}