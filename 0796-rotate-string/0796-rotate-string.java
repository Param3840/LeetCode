class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length()!=goal.length()){
            return false;
        }
        String result=s+s;
        for (int i=0;i<result.length()-goal.length();i++){
            boolean match=true;
            for (int j=0;j<goal.length();j++){
                if (result.charAt(i+j)!=goal.charAt(j)){
                    match=false;
                    break;
                }
            }
            if (match){
                return true;
            }
        }
        return false;
    }
}