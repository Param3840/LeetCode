class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original,rem,sum=0;
        original=x;
        while(x>0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(original==sum){
            return true;
        }
        return false;
    }
}