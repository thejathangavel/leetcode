import java.util.Arrays;

class Solution {
    int dp[][];  
    public int uniquePaths(int m, int n) {
        if (dp == null) {
            dp = new int[m + 1][n + 1];  
            for (int i = 0; i < dp.length; i++) {
                Arrays.fill(dp[i], -1);
            }
        }

        if (m == 1 || n == 1) {
            return 1;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        dp[m][n] = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        return dp[m][n];
    }
}