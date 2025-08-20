class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        for (int i=0;i<=haystack.length()-needle.length();i++){
            String sub=haystack.substring(i,i+needle.length());
            if (sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}