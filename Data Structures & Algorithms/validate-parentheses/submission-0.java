class Solution {
    public boolean isValid(String s) {
        if(s=="" ||  s==null) return true;
        Stack<Character> t = new Stack<>();
        int l=s.length();
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[') t.push(c);
            else if(!t.isEmpty()){
                char z=t.pop();
                //if((int)z-(int)c!=2) return false;
                if (c == ')' && z != '(') return false;
                if (c == '}' && z != '{') return false;
                if (c == ']' && z != '[') return false;
            }
            else return false;
        }
        if(!t.isEmpty()) return false;
        return true;
    }
}