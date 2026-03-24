class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int f = -1;
        for(int i=0;i<coordinates.length;i++){
            if(((coordinates[0][0] - coordinates[1][0]) * (coordinates[i][1] -coordinates[1][1])) != ((coordinates[0][1] - coordinates[1][1]) * (coordinates[i][0]-coordinates[1][0]))){
                f=0;
                break;
            }
        }
        return f == -1;
    }
}