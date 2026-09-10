class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // int i=0;
        // for(int num:nums) {hm.put(num,i); i++;}
        // for(int k:hm.keySet()){
        //     if(hm.containsKey(target-k)) {
        //         return new int[] {hm.get(k),hm.get(target-k)};
        //     }
        // }
        // return new int[] {-1,-1};

        /* This approach works when Array is unique*/

        // int n = nums.length;
        // int[][] arr = new int[n][2];
        // int i = 0;
        // for(int num:nums){
        //     arr[i][0] = num;
        //     arr[i][1] = i;
        //     i++;
        // }
        // Arrays.sort(arr,(e1,e2)->{
        //     return Integer.compare(e1[0],e2[0]);
        // });

        // int l = 0;
        // int r = n-1;
        // while(l<r){
        //     int sum = arr[l][0]+arr[r][0];
        //     if(sum==target) return new int[] {arr[l][1],arr[r][1]};
        //     else if(sum>target) r--;
        //     else l++;
        // }
        // return new int[] {-1,-1};

        /*
        Approach
        .Two pointers + Sorting
        intially we need to store the all the values with those indexes in an array.
        sort the array based on the values.
        Used Classic Two Pointer Pattern to find indexes.

        Time Complexity - O(N-logn)
        Space Complexity - O(2*n)
        This Approach works fine for Duplicates also.
        */
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                return new int[] {hm.get(target-nums[i]),i};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}