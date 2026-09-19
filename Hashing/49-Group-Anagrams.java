class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<Integer>> temp = new HashMap<>();
        int k=0;
        for(String s:strs){
            char[] chrs = s.toCharArray();
            Arrays.sort(chrs);
            String st = new String(chrs);
            temp.put(st,temp.getOrDefault(st,new ArrayList<>()));
            temp.get(st).add(k);
            k++;
        }
        List<List<String>> res = new ArrayList<>();
        for(String s:temp.keySet()){
            ArrayList<String> al = new ArrayList<>();
            for(Integer i:temp.get(s)){
                al.add(strs[i]);
            }
            res.add(new ArrayList<>(al));
        }
        return res;
    }
}
        