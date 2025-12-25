class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder r = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            r.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return r.reverse().toString();
    }
}