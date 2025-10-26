class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = (double)sum/k;
        
        int i=0;
        int j=k;

        while(j<n){
            sum -= nums[i];
            sum += nums[j];

            double avg =(double) sum/k;
            max = Math.max(max , avg);
            i++;
            j++;
        }

        return max;
    }
}