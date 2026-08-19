class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int i=0,j = 0;
        while(i < n && j < n){
            if(i != j && arr[i] == 2 * arr[j]){
                return true;
            }
            else if(arr[i] < 2 * arr[j]){
                i++;
            }
            else{
             j++;
            }  
        }
        return false;
    }
}