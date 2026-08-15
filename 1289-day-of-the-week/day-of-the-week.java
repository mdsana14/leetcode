class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] w = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] d = {31,isLeap(year)?29:28,31,30,31,30,31,31,30,31,30,31};
        int c = 0;
        for(int i=1971;i<year;i++){
            c += i % 4 == 0 ? 366 : 365;
        }
        for(int i=0;i<month - 1;i++){
            c += d[i];
        }
        c += day;
        return w[(c + 4) % 7];
    }
    boolean isLeap(int y){
        if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) return true;
        return false;
    }
}