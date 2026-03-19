class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s = new HashSet<>();
        for(int i : candyType){
            s.add(i);
        }
        int x = candyType.length;
        int y = s.size();
        return y >= x /2 ? x /2 : y;
   }
}