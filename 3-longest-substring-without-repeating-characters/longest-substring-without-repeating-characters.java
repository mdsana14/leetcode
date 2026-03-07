class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> f = new HashMap<>();
        int st=0,e =0,max=0,n = s.length();
        if(s == null || s.isEmpty())return 0;
        else{
            for(e=0;e<n;e++){
                char ch = s.charAt(e);
                f.put(ch, 1+ f.getOrDefault(ch,0));
                if(f.get(ch) <= 1){
                    if(e - st + 1 > max){
                        max = e -st + 1;
                    }
                }
                else{
                    while(st <= e){
                       char c = s.charAt(st);st++;
                       f.put(c,f.get(c) -1);
                       if(f.get(c) == 1){
                         break;
                       }
                    }
                }
            }
            return max;
        }
    }
}