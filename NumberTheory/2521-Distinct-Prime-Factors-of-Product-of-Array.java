class Solution {
    public static HashSet<Long> hs = new HashSet<>();
    public int distinctPrimeFactors(int[] nums) {
        hs.clear();
        for(long n:nums){
            for(long i=2;i*i<=n;i++){
            while(n%i==0){
                hs.add(i);
                n/=i;
            }
        }
        if(n>1) hs.add(n);
        }
        return hs.size();
    }
}