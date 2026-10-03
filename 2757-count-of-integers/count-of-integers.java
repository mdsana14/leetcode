class Solution {
    static final int MOD = 1_000_000_007;
    Long[][][] memo;
    int[] digits;
    int minSum;
    int maxSum;
    public int count(String num1, String num2, int min_sum, int max_sum) {
        this.minSum = min_sum;
        this.maxSum = max_sum;
        long countUpToNum2 = countUpTo(num2);
        String num1MinusOne = subtractOne(num1);
        long countBeforeNum1 = countUpTo(num1MinusOne);
        long answer = (countUpToNum2 - countBeforeNum1 + MOD) % MOD;
        return (int) answer;
    }
    private long countUpTo(String number) {
        digits = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            digits[i] = number.charAt(i) - '0';
        }
        memo = new Long[digits.length][maxSum + 1][2];
        return digitDP(0, 0, 1);
    }
    private long digitDP(int position, int currentSum, int tight) {
        if (currentSum > maxSum) {
            return 0;
        }
        if (position == digits.length) {
            if (currentSum >= minSum &&
                currentSum <= maxSum) {
                return 1;
            }
            return 0;
        }
        if (memo[position][currentSum][tight] != null) {
            return memo[position][currentSum][tight];
        }
        int limit;
        if (tight == 1) {
            limit = digits[position];
        } else {
            limit = 9;
        }
        long ways = 0;
        for (int digit = 0; digit <= limit; digit++) {
            int newSum = currentSum + digit;
            if (newSum > maxSum) {
                break;
            }
            int newTight = 0;
            if (tight == 1 && digit == digits[position]) {
                newTight = 1;
            }
            ways += digitDP(
                position + 1,
                newSum,
                newTight
            );
            ways %= MOD;
        }
        memo[position][currentSum][tight] = ways;
        return ways;
    }
    private String subtractOne(String number) {
        char[] digits = number.toCharArray();
        int i = digits.length - 1;
        while (i >= 0 && digits[i] == '0') {
            digits[i] = '9';
            i--;
        }
        if (i >= 0) {
            digits[i]--;
        }
        int start = 0;
        while (start < digits.length - 1 &&
               digits[start] == '0') {
            start++;
        }
        return new String(digits, start, digits.length - start);
    }
}