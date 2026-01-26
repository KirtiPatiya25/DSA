class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            minDiff = Math.min(minDiff, arr[i]- arr[i-1]);
        }

        List<List<Integer>> result = new ArrayList<>();
        for(int i=1; i<n; i++){
            int diff = arr[i] - arr[i-1];

            if(diff == minDiff){
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return result;
    }
}