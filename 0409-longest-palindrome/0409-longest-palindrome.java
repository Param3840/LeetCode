class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }
            else {
                mp.put(ch,1);
            }
        }
        int pair=0;
        boolean center=false;
        for (char ch : mp.keySet()){
             int freq=mp.get(ch);

             if (freq%2==0){
                 pair+=freq;
             }
             else {
                 pair+=freq-1;
                 center=true;
             }
        }
        if (center){
            pair+=1;
        }
        return pair;
    }
}