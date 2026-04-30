class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int[] r = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()]){
                int id = s.pop();
                r[id] = i - id;
            }
            s.push(i);
        }
        return r;
    }
}