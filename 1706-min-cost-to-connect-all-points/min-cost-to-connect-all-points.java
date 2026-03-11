class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;

        boolean[] visited = new boolean[n];
        int[] minDist = new int[n];

        Arrays.fill(minDist, Integer.MAX_VALUE);
        minDist[0] = 0;

        int cost = 0;

        for(int i = 0; i < n; i++) {

            int u = -1;

            // pick minimum distance point not visited
            for(int j = 0; j < n; j++) {
                if(!visited[j] && (u == -1 || minDist[j] < minDist[u])) {
                    u = j;
                }
            }

            visited[u] = true;
            cost += minDist[u];

            // update distances
            for(int v = 0; v < n; v++) {

                int dist = Math.abs(points[u][0] - points[v][0]) +
                           Math.abs(points[u][1] - points[v][1]);

                if(!visited[v] && dist < minDist[v]) {
                    minDist[v] = dist;
                }
            }
        }

        return cost;
    }
}