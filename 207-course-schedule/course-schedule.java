class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites){
            graph.get(pre[1]).add(pre[0]);
        }

        int[] state = new int[numCourses];

        for(int i =0; i<numCourses; i++){
            if(!dfs(i, graph, state)){
                return false;
            }
        }
        return true;
    }
    private boolean dfs(int course, List<List<Integer>> graph, int[] state){

        if(state[course] == 1){
            return false;
        }
        if(state[course] == 2){
            return true;
        }

        state[course] = 1;

        for(int next : graph.get(course)){
            if(!dfs(next, graph, state)){
                return false;
            }
        }
        state[course] = 2;
        return true;
    }
}