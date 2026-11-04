
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        List<int[]>[] adj = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] t : times) {
            adj[t[0]].add(new int[]{t[1], t[2]});
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[k] = 0;

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) ->
                Integer.compare(a[0], b[0]));

        pq.offer(new int[]{0, k});

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();

            int time = curr[0];
            int node = curr[1];

            if (time > dist[node]) {
                continue;
            }

            for (int[] edge : adj[node]) {

                int next = edge[0];
                int weight = edge[1];

                int newTime = time + weight;

                if (newTime < dist[next]) {

                    dist[next] = newTime;
                    pq.offer(new int[]{newTime, next});
                }
            }
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {

            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }

            ans = Math.max(ans, dist[i]);
        }

        return ans;
    }
}
