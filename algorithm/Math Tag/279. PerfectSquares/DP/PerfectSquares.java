class Solution {
    //1.DP solution TC: O(n*sqrt(n)) SC: O(n)
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int i=1;i<n+1;i++){
            int j = 1;
            int min = Integer.MAX_VALUE;
            //将i分解为一个数的平方(j*j)+(i-j*j),dp[i]=1+dp[i-j*j],改变j的值从中发现最小值，即当前dp[i]的最小可能值
            while(i-j*j>=0){
                min = Math.min(min,dp[i-j*j]+1);
                j++;
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
        
    
        