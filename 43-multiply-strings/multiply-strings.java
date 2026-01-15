class Solution {
    public String multiply(String num1, String num2) {
        int[] a = new int[num1.length() + num2.length()];
        for(int i=num1.length()-1;i >= 0;i--){
            for(int j = num2.length()-1;j >= 0;j--){
                int p = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                a[i+j+1] += p;
                a[i + j] += a[i + j +1] / 10;
                a[i + j + 1] %= 10;
            }
        }
        StringBuilder r = new StringBuilder();
        for(int n : a){
            if(!(r.length() == 0 && n == 0)) { 
                r.append(n);
            }
        }
        return r.length() == 0 ?"0" : r.toString();
    }
}