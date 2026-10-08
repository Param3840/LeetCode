class Solution {
    public String makeGood(String s) {
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (st.length() > 0) {
                char last = st.charAt(st.length() - 1);

                if (last + 32 == curr || last - 32 == curr) {
                    st.deleteCharAt(st.length() - 1);
                } else {
                    st.append(curr);
                }
            } else {
                st.append(curr);
            }
        }
        return st.toString();
    }
}