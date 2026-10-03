class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean special=false;
        boolean space=false;
        int ascii=0;
        for (int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if (i>0 && password.charAt(i)==password.charAt(i-1)){
                return false;
            }
            ascii=ch;
            if (ascii>=65 && ascii<=90){
                upper=true;
            }
            else if (ascii>=97 && ascii<=122){
                lower=true;
            }
            else if (ch>=48 && ch<=57){
                digit=true;
            }
            else if (ch==32){
                space=true;
            }
            else if (ascii>=33 && ascii<=47 || ascii>=58 && ascii<=64 || ascii>=91 && ascii<=96 ||
                    ascii>=123 && ascii<=126){
                special=true;
            }
        }
        if (upper && lower && digit && !space && special && password.length()>=8){
            return true;
        }
        return false;
    }
}