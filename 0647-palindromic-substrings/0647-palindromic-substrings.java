class Solution {
    public int countSubstrings(String s) {
         int count=0;
        for(int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length()+1;j++){
                String str=s.substring(i,j);
                if (isPali(str)){
                    count++;
                }
            }
        }
        return count;
    }
     public static boolean isPali(String s){
        int left=0;
        int right=s.length()-1;
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}