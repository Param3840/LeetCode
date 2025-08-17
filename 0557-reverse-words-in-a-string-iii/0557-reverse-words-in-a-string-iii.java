class Solution {
    public String reverseWords(String s) {
        String ans="";
        StringBuilder st=new StringBuilder("");
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch!=' '){
                st.append(ch);
            }
            else {
                st.reverse();
                ans+=st;
                ans+=" ";
                st=new StringBuilder("");
            }
        }
        st.reverse();
        ans+=st;
        return ans;
    }
}