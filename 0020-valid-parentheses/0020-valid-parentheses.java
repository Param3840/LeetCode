class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            if (ch=='('){
                st.push(ch);
            }
            else if (ch==')'){
                if (st.size()==0) return false;
                if (st.peek()=='(') st.pop();
                else return false;
            }
            if (ch=='['){
                st.push(ch);
            }
            else if (ch==']'){
                if (st.size()==0) return false;
                if (st.peek()=='[') st.pop();
                else return false;
            }
            if (ch=='{'){
                st.push(ch);
            }
            else if (ch=='}'){
                if (st.size()==0) return false;
                if (st.peek()=='{') st.pop();
                else return false;
            }
        }
        if (st.size()!=0) return false;
        else return true;
    }
}