class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int left_max = Integer.MIN_VALUE;
        int right_max = Integer.MIN_VALUE;
        int ans = 0;
        while(l<r){
            ans = Math.max(ans,(r-l)*Math.min(height[l],height[r]));
            if(height[l]>height[r]) r--;
            else l++;
        }
        return ans;
    }
}

/*
#Approach 
.Two pointers

To calculate the most water presented container 

i have intitilized the two pointers starting and ending which are l=0 and r=n-1

for every iteration i need to calculate the ans which is maximum water conatiner
by using the (right idx-left idx)*Math.min(height[l],height[r]).

the left pointer moves when it is less that than the right max.
the right pointer decreases when it is less than the left max.

finally the maximum water with presented in the container will calculated.

worst-case:

Time Complexity - O(n)
Space Complexity - O(1)

*/