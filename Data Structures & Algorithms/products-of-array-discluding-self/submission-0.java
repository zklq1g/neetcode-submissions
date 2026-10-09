class Solution {
    public int[] productExceptSelf(int[] n) {
        int l=n.length;
        int[] a=new int[l+2];
        int[] b=new int[l+2];
        int[] f=new int[l];
        for(int i=0;i<l+2;i++){
            a[i]=1;b[i]=1;
        }
        a[1]=n[0];b[l]=n[l-1];
        for(int i=2;i<l+1;i++) a[i]=a[i-1]*n[i-1];
        for(int i=l-1;i>0;i--) b[i]=b[i+1]*n[i-1];
        for(int i=1;i<l+1;i++) f[i-1]=a[i-1]*b[i+1];
        return f;
    }
}