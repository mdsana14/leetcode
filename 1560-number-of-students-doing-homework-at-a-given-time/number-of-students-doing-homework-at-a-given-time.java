class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int c = 0;
        int i = 0;
        int n = startTime.length;
        while(i < n){
            if((startTime[i] <= queryTime && endTime[i] >= queryTime)){
                c++;
            }
            i++;
        }
        return c;
    }
}