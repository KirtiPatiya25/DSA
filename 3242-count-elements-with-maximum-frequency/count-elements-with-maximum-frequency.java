class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count[] = new int[101];

        int maxFreq = 0;
        int sumFreq = 0;
        for(int element : nums){
            count[element]++;
            int currFreq = count[element];
            if(currFreq > maxFreq){
                maxFreq = currFreq;
                sumFreq = currFreq;
            }
            else if(currFreq == maxFreq){
                sumFreq += currFreq;
            }
        }
        return sumFreq;
    }
}