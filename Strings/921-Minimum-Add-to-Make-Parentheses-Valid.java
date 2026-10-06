class Solution {
    public int minAddToMakeValid(String s) {
        int o = 0;
        int res = 0;
        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(o>0) o--;
                else res++;
            }
            else o++;
        }
        if(o>0){res+=o;}
        return res;
    }
}

