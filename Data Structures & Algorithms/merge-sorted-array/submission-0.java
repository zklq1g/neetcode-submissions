class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int[] r=new int[m];
        for(int i=0;i<m;i++) r[i]=n1[i];
        int a=0,b=0,c=0;
        while(a<m && b<n){
            if(r[a]>n2[b]) n1[c++]=n2[b++];
            else n1[c++]=r[a++];
        }
        while(a<m) n1[c++]=r[a++];
        while(b<n) n1[c++]=n2[b++];
    }
}