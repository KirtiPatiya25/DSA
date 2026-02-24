class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        boolean[] vis = new boolean[n];
        int rs = 0;

        for(int i=0; i<n; i++){
            if(!vis[i]){
                dfs(stones, vis, i);
                rs++;
            }
        }
        return n-rs;
    }
    private void dfs (int[][] stones, boolean[] vis, int i){
        vis[i] = true;

        for(int j=0; j<stones.length; j++){
            if(!vis[j] && (stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1])){
                dfs(stones, vis, j);
            }
        }
    }
}