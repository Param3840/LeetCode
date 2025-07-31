class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for (int i=0;i<stones.length();i++){
            Character ch1=stones.charAt(i);
            mp.put(ch1,mp.getOrDefault(ch1,0)+1);
        }
        int total=0;
        for (int i=0;i<jewels.length();i++){
            Character ch2=jewels.charAt(i);
            if (mp.containsKey(ch2)){
                total=total+mp.get(ch2);
            }
        }
        return total;
    }
}