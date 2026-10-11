class Solution {
    public String mergeAlternately(String a, String b) {
        int x=a.length();
        int y=b.length();
        int m=0,n=0,l=0;
        StringBuilder s=new StringBuilder("");
        while(m<x && n<y){
            s.append(a.charAt(m++));
            s.append(b.charAt(n++));
        }
        if(m<x) s.append(a.substring(m,x));
        if(n<y) s.append(b.substring(n,y));
        return s.toString();
    }
}