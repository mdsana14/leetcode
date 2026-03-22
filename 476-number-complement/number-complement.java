class Solution {
    public int findComplement(int num) {
        int a = 32 - Integer.numberOfLeadingZeros(num);
        int m = (1 << a) -1;
        return m-num;
    }
}