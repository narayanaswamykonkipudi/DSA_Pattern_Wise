class Solution {
    public void solve(int idx,ArrayList<Integer> curr,ArrayList<Integer> arr,List<List<Integer>> res,int n,int k){
        //base case
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<n;i++){
            //pick
                curr.add(arr.get(i));
                solve(i+1,curr,arr,res,n,k);
                curr.remove(curr.size()-1);
        }
        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        solve(0,new ArrayList<>(),arr,res,n,k);
        return res;
    }
}