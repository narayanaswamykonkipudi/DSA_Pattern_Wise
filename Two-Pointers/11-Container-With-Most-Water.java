class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int left_max = Integer.MIN_VALUE;
        int right_max = Integer.MIN_VALUE;
        int idx1 = -1;
        int idx2 = -1;
        int ans = 0;
        while(l<r){
            left_max = Math.max(left_max,height[l]);
            right_max = Math.max(right_max,height[r]);
            idx1 = l;
            idx2 = r;
            ans = Math.max(ans,(idx2-idx1)*Math.min(right_max,left_max));
            if(height[l]>height[r]) r--;
            else l++;
        }
        return ans;
    }
}