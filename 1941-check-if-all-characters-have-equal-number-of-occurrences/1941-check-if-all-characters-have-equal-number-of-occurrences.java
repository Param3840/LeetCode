class Solution {
    public boolean areOccurrencesEqual(String s) {
         HashMap<Character,Integer> mp=new HashMap<>();
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        HashSet<Integer> mpp=new HashSet<>(mp.values());
        return mpp.size()==1;
    }
}