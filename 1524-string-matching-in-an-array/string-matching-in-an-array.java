class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words);
        int n = words.length;
        List<String> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              if(i != j && words[j].contains(words[i])){
                l.add(words[i]);
                break;
             }
            }
        }
      return l;
    }
}