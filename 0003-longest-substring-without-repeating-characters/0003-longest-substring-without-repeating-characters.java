import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int n = s.length();
        HashMap<Character, Integer> mp = new HashMap<>();
        int max = 0;

        while (end < n) {
            char ch = s.charAt(end);
            if (mp.containsKey(ch) && mp.get(ch) >= start) {
                start = mp.get(ch) + 1;
            }
            mp.put(ch, end);
            max = Math.max(max, end - start + 1);
            end++;
        }

        return max;
    }
}
