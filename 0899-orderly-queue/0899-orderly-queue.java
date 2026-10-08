class Solution {
    public String orderlyQueue(String s, int k) {
        if (k > 1) {
            s = sort(s);
            return s;
        }
        String result = s;
        int l = s.length();

        for (int i = 1; i < l; i++) {
            String temp = s.substring(i) + s.substring(0, i);
            if (temp.compareTo(result) < 0) {
                result = temp;
            }
        }
        return result;
    }

    public static String sort(String str) {
        char[] ch = str.toCharArray();

        Arrays.sort(ch);

        return new String(ch);
    }
}