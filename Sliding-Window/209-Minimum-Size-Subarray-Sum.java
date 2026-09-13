class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini = Integer.MAX_VALUE;
        int n = nums.length;
        int l = 0;
        int sum = 0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while((sum-nums[l])>=target){
                sum-=nums[l];
                l++;
            }
            if(sum>=target){
                mini = Math.min(mini,(r-l+1));
            }
        }
        if(mini==Integer.MAX_VALUE) return 0;
        return mini;
    }
}