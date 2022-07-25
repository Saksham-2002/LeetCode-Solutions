class Solution {
    public int fib(int n) {
        int dp[]= new int[n+1];
        
        return fibonacci(n, dp);
    }
    public int fibonacci(int n, int dp[])
    {
        if(n<2)
        {
            return n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        
        return fibonacci(n-2, dp)+fibonacci(n-1, dp);
    }
}