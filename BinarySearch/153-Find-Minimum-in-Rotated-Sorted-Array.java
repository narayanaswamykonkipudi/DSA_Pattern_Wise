class Solution {
    public int findPeak(int nums[]){
        int st = 0;
        int end = nums.length-1;
        while(st<end){
            int mid = st+(end-st+1)/2;
            if(nums[mid]>=nums[0]){
                st = mid;
            }
            else{
                end = mid-1;
            }
        }
        return st;
    }
    public int findMin(int[] nums) {

        int peak = findPeak(nums);
        if(nums.length==1) return nums[0];
        System.out.println(peak);
        if(nums.length-1==peak) return nums[0];
        return nums[peak+1];
    }
}