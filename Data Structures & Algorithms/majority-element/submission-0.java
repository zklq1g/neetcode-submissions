class Solution {
    public int majorityElement(int[] n) {
        /*int l=n.length;
        int[] f=new int[l];
        for(int i=0;i<l;i++){
            //if(++f[i]>l/2) return n[i]; 
            f[i]++;
        }
        int c=0;
        for(int i=0;i<l;i++){
            if(f[i]>l/2) c++;
        }
        return c;*/
        HashMap <Integer,Integer> h= new HashMap<>();
        int l=n.length;
        for(int i=0;i<l;i++){
            if(!h.containsKey(n[i])) h.put(n[i],1);
            else h.put(n[i],h.get(n[i])+1);
        }
        int c=0;
        for(int nm : h.keySet()){
            if(h.get(nm)>l/2) return nm;
        }
        return c;
    }
}