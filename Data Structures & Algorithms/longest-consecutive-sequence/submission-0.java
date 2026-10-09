class Solution {
    public int longestConsecutive(int[] n) {
        HashSet<Integer> h=new HashSet<>();
        int max=0;
        for(int num: n){
            h.add(num);
        }
        for(int k : h){
            int t=0;
            if(!h.contains(k-1)){
            while(h.contains(k+t)) t++;
            if(t>max) max=t;
            }
        }
        return max;
    }
}