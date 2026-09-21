class Solution {
    public boolean isPrime(int n){
        if(n<2){return false;}
        for(int i=2;i*i<=n;i++){
            if(n%i==0){return false;}
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int maxi = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(isPrime(nums[i][i])){ maxi = Math.max(nums[i][i],maxi); }
            if(isPrime(nums[i][n-1-i])){ maxi = Math.max(nums[i][n-1-i],maxi);}
        }
        return maxi;
    }
}