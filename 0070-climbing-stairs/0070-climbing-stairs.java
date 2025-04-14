class Solution {
    public int climbStairs(int n) {
        int first=1;
        int second=2;
        for(int i=3;i<=n;i++){
            int res=first+second;
            first=second;
            second=res;
        }
        return second;
    }
}