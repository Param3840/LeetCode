class Solution {
    public int firstUniqChar(String s) {
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            boolean isUni=true;
            for(int j=0;j<ch.length;j++){
                if(i!=j && ch[i]==ch[j]){
                    isUni=false;
                    break;
                }
            }
        if(isUni){
            return i;
        } 
    }
     return -1;
}
}