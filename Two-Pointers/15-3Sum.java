class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                if(i!=l && i!=r && l!=r){
                    int sum = nums[i]+nums[l]+nums[r];
                    if(sum==0)
                    {
                    ArrayList<Integer> a = new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[l]);
                        a.add(nums[r]);
                        hs.add(a);  
                    l++;
                    r--;}
                    else if(sum<0){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        for(ArrayList<Integer> r:hs){
            res.add(r);
        }
        return res;
    }
}