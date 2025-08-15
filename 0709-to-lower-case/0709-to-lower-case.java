class Solution {
    public String toLowerCase(String s) {
        StringBuilder st = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            // boolean flag = true;
            char ch = s.charAt(i);
            int asci = (int) ch;
            if (asci <= 97) {
                asci += 32;
                char dh = (char) asci;
                st.setCharAt(i, dh);
            }
        }
        return String.valueOf(st);
    }
}