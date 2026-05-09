class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> val=new Stack<>();
        for (int i=0;i< tokens.length;i++){
            String s=tokens[i];
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int v2=val.pop();
                int v1=val.pop();
                if (s.equals("+")) val.push(v1+v2);
                if (s.equals("-")) val.push(v1-v2);
                if (s.equals("*")) val.push(v1*v2);
                if (s.equals("/")) val.push(v1/v2);
            }
            else {
                int number=Integer.parseInt(s);
                val.push(number);
            }
        }
        return val.peek();
    }
}