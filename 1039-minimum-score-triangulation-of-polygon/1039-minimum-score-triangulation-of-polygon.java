class Solution {
    int[][] dp;

    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(values, 0, n - 1);
    }

    private int solve(int[] values, int i, int j) {
        // base case: fewer than 3 vertices => no triangle
        if (j - i < 2) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        int res = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            int cost = solve(values, i, k) 
                     + values[i] * values[k] * values[j] 
                     + solve(values, k, j);
            res = Math.min(res, cost);
        }
        dp[i][j] = res;
        return res;
    }
}
