class Solution {
    private void swap(int a,int b){
    }
    public void moveZeroes(int[] nums) {
       int n = nums.length;
       int l = 0;
       int r = 1;
       while(r<n){
        if(nums[l]==0 && nums[r]!=0){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            // System.out.println(l+":"+r);
            l++;
            r++;
        }
        else if(nums[l]!=0){
            l++;
            r++;
        }
        else{
            r++;
        }
       }
    }
}