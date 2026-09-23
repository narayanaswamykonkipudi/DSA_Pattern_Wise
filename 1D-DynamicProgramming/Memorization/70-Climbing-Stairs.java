class Solution {
    private static int solve(int[] dp,int n){
        if(n<=1) return 1;
        
        //memorization
        if(dp[n]!=-1){
            return dp[n];
        }
        //find the subproblem
        return dp[n] = solve(dp,n-1)+solve(dp,n-2);
    }
    public int climbStairs(int n) {
        if(n<=1){
            return 1;
        }
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        solve(dp,n);
        return dp[n];
    }
}