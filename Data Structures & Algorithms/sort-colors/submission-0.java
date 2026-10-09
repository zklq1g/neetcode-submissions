class Solution {
    public void sortColors(int[] nums) {
        int a,b,c;
        a=-1;
        b=nums.length;
        c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) a++;
            else if(nums[i]==2) b--;
        }
        for(int i=0;i<=a;i++) nums[i]=0;
        for(int i=a+1;i<b;i++) nums[i]=1;
        for(int i=b;i<nums.length;i++) nums[i]=2;
    }
}