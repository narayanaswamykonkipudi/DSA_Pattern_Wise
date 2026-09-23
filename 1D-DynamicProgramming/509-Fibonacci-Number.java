class Solution {
    public static int fibbi(int[] dp,int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return fibbi(dp,n-1)+fibbi(dp,n-2);
    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fibbi(dp,n);
    }
}