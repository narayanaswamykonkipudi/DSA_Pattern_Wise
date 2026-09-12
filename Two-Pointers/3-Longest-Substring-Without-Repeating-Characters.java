class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int n = s.length();
        int l = 0;
        int maxi = 0;
        for(int r=0;r<n;r++){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
            while(hm.get(s.charAt(r))>1){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                l++;
            }
            maxi = Math.max(maxi,(r-l+1));
        }
        return maxi;
    }
}