class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();

        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            if (st.size()==0 || st.peek()!=ch) {
                st.push(ch);
            }
            else if (st.peek()==ch){
                    st.pop();
            }
        }
        StringBuilder str=new StringBuilder();
       while (!st.isEmpty()){
           str.append(st.pop());
       }
       return str.reverse().toString();
    }
}