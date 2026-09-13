class Solution {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1;
        int mid = 0;
        while(mid<=r){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[l];
                nums[l] = temp;
                mid++;
                l++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[r];
                nums[r] = temp;
                r--;         
            }
        }
        
    }
}