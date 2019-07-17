class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        dp[0] = 1;
        int size = primes.length;
        int[] index = new int[size];
        
        for(int i=1;i<n;i++){
            int min = dp[index[0]]*primes[0];
            for(int j=1;j<size;j++){
                min = Math.min(min,dp[index[j]]*primes[j]);
            }
            for(int k=0;k<size;k++){
                if(min==dp[index[k]]*primes[k])
                    index[k]++;
            }
            dp[i]=min;
        }
        return dp[n-1];
    }
}