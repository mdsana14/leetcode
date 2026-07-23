class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] t = new int[arr.length];
        for(int x =0;x<arr.length;x++){
            t[x] = arr[x];
        }
        Arrays.sort(t);
        Map<Integer,Integer> s = new HashMap<>();
        int rk = 1;
        for(int x : t){
            if(!s.containsKey(x)){
                s.put(x, rk);
                rk++;
            }
        }
        int[] r = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            r[i] = s.get(arr[i]);
        }
        return r;
    }
}