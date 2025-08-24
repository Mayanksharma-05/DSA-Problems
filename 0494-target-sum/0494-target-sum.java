class Solution {
    public int targetSumSubsets(int[] nums, int target, int csum, int n, int[][] dp){
        if(n == 0){
            return dp[n][csum] = csum == target ? 1 : 0;
        }

        if(dp[n][csum] != -1) return dp[n][csum];

        int count = targetSumSubsets(nums, target, csum + nums[n-1], n-1, dp);
        count += targetSumSubsets(nums, target, csum + (-nums[n-1]), n-1, dp);

        return dp[n][csum] = count;
    }

    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;

        for(int e: nums){
            sum += e;
        }

        if(target > sum || target < -sum) return 0;

        // because max negative is -sum, shifting everything by sum to take -sum -> 0
        int newTar = target + sum;
        int newStartingPoint = 0 + sum;
        // range of sum is -sum to sum -> shifting to positive values -> 0 to 2*sum
        int[][] dp = new int[n+1][2*sum + 1];
        for(int[] d: dp) Arrays.fill(d, -1);

        return targetSumSubsets(nums, newTar, newStartingPoint, n, dp);
    }
