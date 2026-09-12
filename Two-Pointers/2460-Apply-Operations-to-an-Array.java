class Solution {
    public int[] applyOperations(int[] nums) {
        int res[] = nums;
        int n = nums.length;
        int l = 0;
        for(int r=1;r<n;r++){
            if(res[l]==res[r]){
                res[l] *= 2;
                res[r] = 0;
            }
            l++;
        }
        int l2 = 0;
        int r = 1;
        while(r<n){
            if(res[l2]==0 && res[r]!=0){
                int temp = nums[l2];
                nums[l2] = nums[r];
                nums[r] = temp;
                l2++;
                r++;
            }
            else if(nums[l2]!=0){
                l2++;
                r++;
            }
            else{
                r++;
            }
        }
        return res;
    }
}