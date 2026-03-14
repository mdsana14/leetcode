import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1,j =num2.length()-1;
        int c= 0;
        StringBuilder ans = new StringBuilder();
        while(i >= 0 || j >= 0 ){
              int a = (i >= 0)?num1.charAt(i) -'0' : 0;
              int b = (j >= 0)?num2.charAt(j) -'0' : 0;
              int sum = a + b + c;
              int d = sum % 10;
              c = sum /10;
              ans.append(d);
              i--;
              j--;
        }
        if(c > 0){
            ans.append(1);
        }
        return ans.reverse().toString();
    }
}