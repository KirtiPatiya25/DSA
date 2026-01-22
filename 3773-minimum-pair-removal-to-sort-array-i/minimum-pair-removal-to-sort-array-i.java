class Solution {

    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        var count = 0;

        while (list.size() > 1) {
            var isAscending = true;
            var minSum = Integer.MAX_VALUE;
            var targetIndex = -1;

            for (var i = 0; i < list.size() - 1; i++) {
                var sum = list.get(i) + list.get(i + 1);

                if (list.get(i) > list.get(i + 1)) {
                    isAscending = false;
                }

                if (sum < minSum) {
                    minSum = sum;
                    targetIndex = i;
                }
            }

            if (isAscending) {
                break;
            }

            count++;
            list.set(targetIndex, minSum);
            list.remove(targetIndex + 1);
        }

        return count;
    }
}