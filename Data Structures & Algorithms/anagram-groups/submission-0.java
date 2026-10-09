class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(String S:s){
            char[] c=S.toCharArray();
            Arrays.sort(c);
            String sk=new String(c);
            if(!h.containsKey(sk)) h.put(sk,new ArrayList<>());
            h.get(sk).add(S);
        }
        return new ArrayList<>(h.values());
    }
}