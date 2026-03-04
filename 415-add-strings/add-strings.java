import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger x = new BigInteger(num1);
        BigInteger y = new BigInteger(num2);
        BigInteger sum = x.add(y);
        String r = String.valueOf(sum);
        return r;
    }
}