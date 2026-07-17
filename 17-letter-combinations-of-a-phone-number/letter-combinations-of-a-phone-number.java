class Solution {
     String[] op = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     StringBuilder s;
     List<String> l;
    public List<String> letterCombinations(String digits) {
        s = new StringBuilder();
        l = new ArrayList<>();
        letter(digits,0);
        return l;
    }
    public void letter(String digits,int i) {
       if(i >= digits.length()){
         l.add(s.toString());
         return;
       }
       System.out.println(s.toString());
       for(char c : op[digits.charAt(i) - '0'].toCharArray()){
         s.append(c);
         System.out.println(s.toString());
         letter(digits,i + 1);
         s.setLength(s.length() - 1);
         System.out.println(s.toString());
       }
    }
}