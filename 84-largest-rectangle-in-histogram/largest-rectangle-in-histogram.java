class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] x1 = nxid(heights);
        int[] x2 = pxid(heights);
        int m =0;
        for(int i=0;i<n;i++){
            int w = x1[i] - x2[i] -1;
            int area =  heights[i] * w;
            m = Math.max(m,area);
        }
        return m;
    }
    static int[] nxid(int[] heights){
        int n = heights.length;
        int[] a = new int[n];
        Arrays.fill(a,n);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
        while(!st.isEmpty() && heights[i] < heights[st.peek()]){
            a[st.peek()] = i;
            st.pop();
        }
        st.push(i);
        }
        return a;
    }
    static int[] pxid(int[] heights){
        int n = heights.length;
        int[] b = new int[n];
        Arrays.fill(b,-1);
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && heights[i] < heights[st.peek()]){
            b[st.peek()] = i;
            st.pop();
        }
        st.push(i);
        }
        return b;
    }
}