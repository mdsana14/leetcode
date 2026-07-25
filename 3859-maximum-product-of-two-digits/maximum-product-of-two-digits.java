class Solution {
    public int maxProduct(int n) {
        int p = 0;
        ArrayList<Integer> a = new ArrayList<>();
        while(n > 0){
            int x = n % 10;
            a.add(x);
            n /= 10;
        }
        int cp = 1;
        for(int i=0;i<a.size();i++){
           for(int j=i+1;j<a.size();j++){
            cp = a.get(i) * a.get(j);
            p = Math.max(p,cp);
           }
        }
        return p;
    }
}