class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0)return 0;
        long sum = 0;
        long x = 1;
        StringBuilder t = new StringBuilder();
        while(n > 0){
            int a = n % 10;
            if(a > 0){
                t.append(a);
            }
            n /= 10;
        }
        String tp = t.reverse().toString();
        int num = Integer.parseInt(tp);
        x = num;
        while(num > 0){
            int a = num % 10;
            sum += a;
            num /= 10;
        }
        x *= sum;
        return x;
    }
}