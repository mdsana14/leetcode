class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] r = Arrays.copyOf(arr,n);
        int j=0;
        for(int i=0;i<n && j < n;i++){
            if(r[i] == 0 && j < n-1){
                arr[j++] = 0;
                arr[j++] = 0;
            }
            else{
                arr[j++] = r[i];
            }
        }

    }
}