class Solution {
    public int[] printprimes(int l,int r){
        int[] primes = new int[r+1];
        for(int i=0;i<=r;i++){
            primes[i]=i;
        }
        for(int i=2;i*i<=r;i++){
            for(int j=i*i;j<=r;j+=i){
                if(primes[j]==j){
                    primes[j]=i;
                }
            }
        }
        ArrayList<Integer> ps = new ArrayList<>();
        for(int i=l;i<=r;i++){
            if(primes[i]==i){
            if(primes[i]>=2)
                ps.add(i);
            }
        }
        int c = 0;
        int res[] = {-1,-1};
        int mini = Integer.MAX_VALUE;
        int j=1;
        for(Integer i=0;i<ps.size()-1;i++){
                int curr = ps.get(j)-ps.get(i);
                
                // System.out.println(curr);
                if(curr<mini){
                    mini = curr;
                    res[0]=ps.get(i);
                    res[1]=ps.get(j);
                    // System.out.println(Arrays.toString(res));
            }
            j++;
        }

        // System.out.println(Arrays.toString(primes));
        System.out.println(ps);
        return res;
    }

    public int[] closestPrimes(int left, int right) {
        
        int pair[] = {-1,-1};
        if(left<2 && right<2){
            return pair;
        }
        return printprimes(left,right);
        // return pair;
    }
}