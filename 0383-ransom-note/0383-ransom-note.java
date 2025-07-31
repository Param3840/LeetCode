class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for (int i=0;i<magazine.length();i++){
            Character ch=magazine.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for (int i=0;i<ransomNote.length();i++){
            Character ch2=ransomNote.charAt(i);
            if (!mp.containsKey(ch2) || mp.get(ch2)==0){
                return false;
            }
            else {
                mp.put(ch2,mp.get(ch2)-1);
            }
        }
        return true;
    }
}