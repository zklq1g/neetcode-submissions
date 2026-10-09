class Solution {
    public void m(int arr[],int l,int m,int r){
        int a=m-l+1;
        int b=r-m;
        int[] t1=new int[a];
        int[] t2=new int[b];
        for(int i=0;i<a;i++) t1[i]=arr[l+i];
        for(int i=0;i<b;i++) t2[i]=arr[m+1+i];
        int i=0,j=0,k=l;
        while(i<a && j<b){
            if(t1[i]<t2[j]) arr[k++]=t1[i++];
            else arr[k++]=t2[j++];
        }
        while(i<a) arr[k++]=t1[i++];
        while(j<b) arr[k++]=t2[j++];
    }
    public void ms(int a[],int l,int r){
        if(l<r){
            int m=(l+r)/2;
            ms(a,l,m);
            ms(a,m+1,r);
            m(a,l,m,r);
        }
    }
    public int[] sortArray(int[] nums) {
        ms(nums,0,nums.length-1);
        return nums;
    }
}