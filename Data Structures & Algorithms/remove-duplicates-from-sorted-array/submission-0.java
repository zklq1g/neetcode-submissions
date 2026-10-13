class Solution {
    public int removeDuplicates(int[] n) {
        int c=0;
        int[] t=new int[n.length];
        t[c++]=n[0];
        for(int i=1;i<n.length;i++){
            if(t[c-1]!=n[i]) t[c++]=n[i];
        }
        for(int i=0;i<c;i++) n[i]=t[i];
        return c;
    }
}