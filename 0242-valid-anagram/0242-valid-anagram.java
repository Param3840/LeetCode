class Solution {
    public HashMap<Character,Integer> freq(String str){
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        return mp;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> mp=freq(s);
        for(int i=0;i<t.length();i++){
            Character ch=t.charAt(i);
            if(!mp.containsKey(ch)){
                return false;
            }
            int curr=mp.get(ch);
            mp.put(ch,curr-1);
        }
        return true;
    }
}