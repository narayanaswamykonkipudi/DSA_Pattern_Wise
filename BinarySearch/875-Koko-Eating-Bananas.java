class Solution {
    private boolean isValid(int piles[],int h,int k){
        int tot=0;
        for(int p:piles){
            tot+=(p)/k;
            if(p%k!=0){
                tot+=1;
            }
        }
        return tot<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int maxi = Integer.MIN_VALUE;
        for(int p:piles){
            maxi = Math.max(p,maxi);
        }
        int r = maxi;
        int res = maxi;
        while(l<r){
            int mid = l+(r-l)/2;
            if(isValid(piles,h,mid)){
                res = Math.min(res,mid);
                r = mid;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
}