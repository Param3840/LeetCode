class Solution {
    public boolean halvesAreAlike(String s) {
           StringBuilder st1=new StringBuilder();
        StringBuilder st2=new StringBuilder();
        int countSt1=0;
        int countSt2=0;
        int half = s.length()/2;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (i<half){
                st1.append(ch);
            }
            else {
                st2.append(ch);
            }
        }
        for (int i=0;i<st1.length();i++){
            char ch=st1.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||
            ch=='O' || ch=='U'){
                countSt1++;
            }
        }
        for (int i=0;i<st2.length();i++){
            char ch=st2.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||
                    ch=='O' || ch=='U'){
                countSt2++;
            }
        }
        if (countSt1==countSt2){
            return true;
        }
        return false;
    }
}