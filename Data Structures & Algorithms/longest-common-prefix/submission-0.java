class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs[0].length()==0) return "";
        StringBuilder r=new StringBuilder("");
        if(strs.length==1) return strs[0];
        for(int i=0;i<strs[0].length();i++){
            int k=0;
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if (i >= strs[j].length() || strs[j].charAt(i) != c) return r.toString();
            }
            r.append(c);
        }
        return r.toString();
    }
}