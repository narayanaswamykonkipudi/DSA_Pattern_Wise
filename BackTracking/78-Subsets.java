class Solution {
    static List<List<Integer>> res=  new ArrayList<>();
    public static void solve(int idx,int[] nums,ArrayList<Integer> subs,int n){
        //base case
        if(idx>=nums.length){
            res.add(new ArrayList<>(subs));
            return;
        }

        //pick
        subs.add(nums[idx]);
        solve(idx+1,nums,subs,n);
        subs.remove(subs.size()-1);

        //non pick
        solve(idx+1,nums,subs,n);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        solve(0,nums,new ArrayList<Integer>(),nums.length);
        return res;
    }
}