class Solution {
    public int climbStairs(int n) {
        int p2 = 1;
        int p1 = 1;
        for(int i=2;i<n+1;i++){
            int temp = p1;
            p1+=p2;
            p2=temp;
        }
        return p1;
    }
}