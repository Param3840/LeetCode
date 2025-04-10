class Solution {
    public boolean isPali(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int maxLen=0;
        String res="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isPali(sub) && sub.length()>maxLen){
                    res=sub;
                    maxLen=sub.length();
                }
            }
        }
        return res;
    }
}