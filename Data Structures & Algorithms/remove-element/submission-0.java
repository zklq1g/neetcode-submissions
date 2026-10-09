class Solution {
    public int removeElement(int[] n, int v) {
        int k=0;
        for(int i=0;i<n.length;i++) if(n[i]!=v) n[k++]=n[i];
        return k;
    }
}