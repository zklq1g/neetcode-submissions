class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        /*HashMap<Character,Integer> a=new HashMap<>();
        HashMap<Character,Integer> b=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!a.containsKey(s.charAt(i))) a.put(s.charAt(i),1);
            else a.put(s.charAt(i),s.getValue(i)+1);
        }*/
        /*int sum=0;
        int a=s.length();
        int b=t.length();
        for(int i=0;i<a;i++){
            sum+= s.charAt(i) - '0';
        }
        for(int i=0;i<b;i++){
            sum-= t.charAt(i) - '0';
        }
        if(sum==0 && t.charAt(b-1)==s.charAt(a-1)) return true;
        return false;*/
        HashMap<Character,Integer> h=new HashMap<>();
        int a=s.length();
        int b=t.length();
        for(int i=0;i<a;i++){
            if(!h.containsKey(s.charAt(i))) h.put(s.charAt(i),1);
            else h.put(s.charAt(i),h.get(s.charAt(i))+1);
        }
        for(int i=0;i<b;i++){
            if(!h.containsKey(t.charAt(i))) return false;
            else{
                h.put(t.charAt(i),h.get(t.charAt(i))-1);
                if(h.get(t.charAt(i))<0) return false;
            }
        }
        return true;
    }
}