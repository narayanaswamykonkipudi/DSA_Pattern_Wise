class Solution {
    public static ArrayList<String> res = new ArrayList<>();
    public static void solve(int l,int r,int n,StringBuilder s){

        //base case
        if(l==n && r==n){
            res.add(s.toString());
            return;
        }

        //left push
        if(l<n){
           s.append('('); 
           solve(l+1,r,n,s);
           s.deleteCharAt(s.length()-1);
        }
        //right push
        if(r<l){
            s.append(')');
            solve(l,r+1,n,s);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        res.clear();
        solve(0,0,n,new StringBuilder(""));
        return res;
    }
}