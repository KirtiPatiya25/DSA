class Solution {
    public int maxBuilding(int n, int[][] restrictions) {

        if (restrictions.length == 0) {
            return n - 1;
        }

        int m = restrictions.length;

        int[][] arr = new int[m + 1][2];

        arr[0] = new int[]{1, 0};

        for (int i = 0; i < m; i++) {
            arr[i + 1] = restrictions[i];
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        // Left -> Right
        for (int i = 1; i < arr.length; i++) {
            int dist = arr[i][0] - arr[i - 1][0];

            arr[i][1] = Math.min(
                arr[i][1],
                arr[i - 1][1] + dist
            );
        }

        // Right -> Left
        for (int i = arr.length - 2; i >= 0; i--) {
            int dist = arr[i + 1][0] - arr[i][0];

            arr[i][1] = Math.min(
                arr[i][1],
                arr[i + 1][1] + dist
            );
        }

        int ans = 0;

        for (int i = 1; i < arr.length; i++) {
            int x1 = arr[i - 1][0];
            int h1 = arr[i - 1][1];

            int x2 = arr[i][0];
            int h2 = arr[i][1];

            int dist = x2 - x1;

            int peak = (h1 + h2 + dist) / 2;

            ans = Math.max(ans, peak);
        }

        // Buildings after the last restriction
        int lastPos = arr[arr.length - 1][0];
        int lastHeight = arr[arr.length - 1][1];

        ans = Math.max(
            ans,
            lastHeight + (n - lastPos)
        );

        return ans;
    }
}