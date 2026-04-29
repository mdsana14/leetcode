class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> r = new ArrayList<>();
        r.add(words[0]);
        for(int i=1;i<words.length;i++){
            char[] a = words[i].toCharArray();
            char[] b = r.get(r.size() - 1).toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(!Arrays.equals(a,b)){
                r.add(words[i]);
            }
        }
        return r;
    }
}