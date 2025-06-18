class Solution {
    public int fib(int n) {
      if(n==0 || n==1)  {
        return n;
      }
      int first=fib(n-1);
      int sec=fib(n-2);
      return first+sec;
    }
}