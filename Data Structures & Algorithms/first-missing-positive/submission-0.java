class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        int ans=Integer.MAX_VALUE;
        for(int n : nums) if(!h.contains(n) & n>=0) h.add(n);
        for(int n : h){
            if(!h.contains(n-1)){
                while(h.contains(n) && n<Integer.MAX_VALUE) n++;
                if(n>1 && !h.contains(1)) return 1;
                if(ans>n) ans=n;
            }
        }
        if(ans==Integer.MAX_VALUE) ans=1;
        return ans;
    }
}