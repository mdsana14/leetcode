class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> m = new HashMap<>();
        for(int i=0;i<names.length;i++){
            m.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] r = new String[heights.length];
        int id = 0;
        for(int i=heights.length-1;i>=0;i--){
            r[id] = m.get(heights[i]);
            id++;
        }
        return r;
    }
}