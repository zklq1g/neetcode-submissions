class Solution {
    public int[] twoSum(int[] n, int t) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int c=0;
        for(int i=0;i<n.length;i++){
            int f=t-n[i];
            if(h.containsKey(f)){
                int[] a=new int[2];
                a[1]=i;a[0]=h.get(f);
                return a;
            }
            else h.put(n[i],i);
        }
        return new int[0];
    }
}