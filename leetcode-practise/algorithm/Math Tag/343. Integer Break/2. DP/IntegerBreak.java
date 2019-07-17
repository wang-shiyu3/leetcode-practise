class Solution {    
    //2.DP Solution
    public int integerBreak(int n){
        int[] dp = new int[n+1];
        dp[2]=1;
        for(int i=3;i<n+1;i++){
            for(int j=1;2*j<=i;j++){
                dp[i] = Math.max(dp[i],(Math.max(j,dp[j]))*Math.max(i-j,dp[i-j]));
            }
        }
        return dp[n];
    }
}