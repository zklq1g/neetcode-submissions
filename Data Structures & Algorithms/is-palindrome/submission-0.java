class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length(),k=0;
        s=s.toLowerCase();
        char[] c=new char[s.length()];
        for(i=0;i<s.length();i++) if(Character.isLetterOrDigit(s.charAt(i))) c[k++]=s.charAt(i);
        i=0;j=k-1;
        if(k==0) return true;
        while(i<=j){
            if(c[i]!=c[j]) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}