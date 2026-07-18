class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int ne = edges.length;
        HashMap<Integer,List<Integer>> g = new HashMap<>();
        for(int u=0;u<n;u++){
            g.put(u,new ArrayList<>());
        }
        for(int v = 0;v<ne;v++){
            int x = edges[v][0], y = edges[v][1];
            g.get(x).add(y);
            g.get(y).add(x);
        }
       /* for(int u=0;u<n;u++){
            System.out.print(u+":");
            for(int v : g.get(u)){
                System.out.print(v+" ");
            }
            System.out.println();
        }*/
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> vis = new HashSet<>();
        q.add(source);
        vis.add(source);
        while(!q.isEmpty()){
            int u = q.remove();
            if(u == destination)return true;
            for(int v : g.get(u)){
                if(!vis.contains(v)){
                    q.add(v);
                    vis.add(v);
                }
            }
        }
       return false;
    }
}