class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> in = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                in.add(1);
            }
            r.add(in);
        }
        for(int i=2;i<numRows;i++){
            for(int j=1;j<i;j++){
                r.get(i).set(j,r.get(i-1).get(j-1) + r.get(i-1).get(j));
            }
        }
        return r;
    }
}