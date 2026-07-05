class Solution {
    void combSum(int[] candidates , int i , List<Integer> ans , List<List<Integer>> res  , int target){
        if(i == candidates.length || target <  0) return;

        if(target == 0){
            res.add(new ArrayList<>(ans));
            return;
        }

        ans.add(candidates[i]);
        combSum(candidates, i, ans, res, target-candidates[i]);

        ans.remove(ans.size() - 1);
        combSum(candidates, i+1, ans, res, target);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>(); 
        combSum(candidates, 0, ans, res, target);
        return res;
    }
}