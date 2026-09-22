class Solution {
    public static List<List<Integer>> res = new ArrayList<>();
    public void solve(int[] nums,boolean[] v,ArrayList<Integer> curr,int n){
        if(curr.size()==n){
            res.add(new ArrayList<Integer>(curr));
            return;
        }
        for(int i=0;i<n;i++){
            if(!v[i]){
                v[i] = true;
                curr.add(nums[i]);
                solve(nums,v,curr,n);
                v[i] = false;
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        res.clear();
        int n = nums.length;
        boolean visited[] = new boolean[n];
        solve(nums,visited,new ArrayList<Integer>(),n);
        return res;
    }
}