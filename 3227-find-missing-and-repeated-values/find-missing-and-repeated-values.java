class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;

        int[] ans = new int [2];
        int a , b;

        int expSum = 0;
        int actualSum = 0;
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){

                actualSum += grid[i][j];
                
                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                    ans[0] = a;
                } 
                else{
                    set.add(grid[i][j]);
                }
            }
        }
        a = ans[0];
        expSum = (n*n) * (n*n + 1) / 2;
        b = expSum + a - actualSum;
        ans[1] = b;

        return ans;
    }
}