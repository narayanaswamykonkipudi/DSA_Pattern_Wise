class Solution {
    static List<List<Integer>> res = new ArrayList<>();
    public static void solve(int idx,int[] candidates,int target,ArrayList<Integer> subs,int n,int sum){

        //base case
            if(idx>=n ){  
                if(sum==target){
                res.add(new ArrayList<>(subs));
                }
                if(sum>target){
                    return;
                }
                return;
            }

        //pick
        if(sum<target){
            subs.add(candidates[idx]);
            sum+=candidates[idx];
            solve(idx,candidates,target,subs,n,sum);
            subs.remove(subs.size()-1);
            sum-=candidates[idx];
        }

        //non pick
        solve(idx+1,candidates,target,subs,n,sum);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res.clear();
        solve(0,candidates,target,new ArrayList<>(),candidates.length,0);
        return res;
    }
}