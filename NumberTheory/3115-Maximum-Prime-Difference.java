class Solution {
    public boolean isprime(int n){
        int c = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                c+=1;
            }
        }
        return c==1;

    }
    public int diff(int nums[]){
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(isprime(nums[i])&&nums[i]>=2){
                primes.add(i);
            }
        }
        if(primes.size()<=1){
            return 0;
        }
        // System.out.println(primes);
        return Math.abs(primes.get(0)-primes.get(primes.size()-1));
    }
    public int maximumPrimeDifference(int[] nums) {
        return diff(nums);
    }
}