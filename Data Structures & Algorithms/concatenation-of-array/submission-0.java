class Solution {
    public int[] getConcatenation(int[] n) {
        int l=2*n.length;
        int[] a=new int[l];
        for(int i=0;i<l/2;i++){
            a[i]=n[i];
            a[l/2 + i]=n[i];
        }
        return a;
    }
}