class Solution {
    public int lastRemaining(int n) {
        int head=1;
        int step=1;
        int rem=n;
        boolean LTR=true;
        while(rem>1){
        if(LTR || rem%2==1){
            head=head+step;
        }
        step=step*2;
        rem=rem/2;
        LTR=!LTR;
    }
        return head;
    }
}