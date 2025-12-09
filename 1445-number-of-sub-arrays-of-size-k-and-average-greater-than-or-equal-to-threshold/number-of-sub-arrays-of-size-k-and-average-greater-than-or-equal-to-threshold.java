class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        // int maxT = k * threshold;
        int count = 0;
        

        for(int i=0; i <= n-k; i++){
            int sum = 0;
            for(int j=i; j < i+k; j++){
                sum = sum + arr[j];
            }

            if(sum/k >= threshold){
                count++;
            }
        }
        return count;
    }
}