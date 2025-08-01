class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for (String s : strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if (!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}