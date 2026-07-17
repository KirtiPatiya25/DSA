class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i =0; i<=edges.length; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];

            boolean[] vis = new boolean[edges.length + 1];

            if(hasPath(u,v,graph,vis)){
                return edge;
            }
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return new int[0];
           
    }

   private boolean hasPath(int src, int dest,
                            List<List<Integer>> graph,
                            boolean[] vis) {

        if (src == dest)
            return true;

        vis[src] = true;
        for (int next : graph.get(src)) {

            if (!vis[next]) {

                if (hasPath(next, dest, graph, vis))
                    return true;
            }
        }

        return false;
    }
}