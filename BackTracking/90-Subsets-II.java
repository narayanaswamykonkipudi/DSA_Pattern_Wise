class Solution {
    public static HashSet<List<Integer>> res = new HashSet<>();
    public static void solve(int idx,int[] nums,int n,ArrayList<Integer> subs){

        //base case
        if(idx>=n){
            res.add(new ArrayList<Integer>(subs));
            return;
        }

        //pick
        subs.add(nums[idx]);
        solve(idx+1,nums,n,subs);
        subs.remove(subs.size()-1);

        //non pick
        solve(idx+1,nums,n,subs);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res.clear();
        Arrays.sort(nums);
        solve(0,nums,nums.length,new ArrayList<Integer>());
        List<List<Integer>> ans = new ArrayList<>(res);
        return ans;
    }
}