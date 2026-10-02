class Solution {
    public int myAtoi(String s) {
       int result=0;
        int sign=1;
        int start=0;

        while (start<s.length() && s.charAt(start)==' '){
            start++;
        }
 if (start == s.length()) {
            return 0;
        }

        if (s.charAt(start)=='-'){
            sign=-1;
            start++;
        }
        else if (s.charAt(start)=='+'){
            sign=+1;
            start++;
        }
        for (int i=start;i<s.length();i++){
            char ch=s.charAt(i);

            if (ch<'0' || ch>'9'){
                break;
            }
            int digit=ch-'0';
            if (result>214748364 || (result==214748364 && digit>7)){

                if (sign== -1){
                    return -2147483648;
                }
                else {
                    return 2147483647;
                }
            }
            result=result*10+digit;
        }
        return sign*result;
    }
}