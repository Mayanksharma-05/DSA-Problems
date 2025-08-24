class Solution {
    public int coinChangeCombination_rec(int[] coins, int tar, int idx,int[][] dp){
        if(tar == 0){
            return dp[tar][idx] = 1;
        }

        if(dp[tar][idx] != -1) return dp[tar][idx];

        int totalWays = 0;
        for(int j = idx; j<coins.length; j++){
            if(tar - coins[j] >= 0){
                totalWays += coinChangeCombination_rec(coins, tar-coins[j], j, dp);
            }
        }

        return dp[tar][idx] = totalWays;
    }

    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length+1];
        for(int[] d: dp) Arrays.fill(d,-1);
        return coinChangeCombination_rec(coins,amount,0,dp);
    }
}