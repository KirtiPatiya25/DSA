class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int len = bloomDay.length;
        if((long) m*k > len) return -1;
        
        int low = 1;
        int high = (int) 1e9;

        while(low < high){
            int mid = low + (high - low)/2;

            if(canMakeBouquets(bloomDay, m, k, mid)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        };
        return low;
    }
    private boolean canMakeBouquets(int[] bloomDay, int m , int k, int day){
        int total = 0;

        for(int i = 0; i<bloomDay.length; i++){
            int count = 0;
            while(i<bloomDay.length && count < k && bloomDay[i] <= day){
                count ++;
                i++;
            }
            if(count == k){
                total++;
                i--;
            }
            if(total >= m){
                return true;
            }
        }
        return false;
    }
}