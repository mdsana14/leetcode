class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> r = new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                l.add(1);
            }
            r.add(l);
        }
        for(int i=2;i<rowIndex+1;i++){
            for(int j=1;j<i;j++){
                r.get(i).set(j,r.get(i-1).get(j-1) + r.get(i-1).get(j));
            }
        }
        List<Integer> res = r.get(r.size() -1);
        return res;
    }
}