class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1000000007;
        int odd=0,even=1;
        int prefix=0;
        int result=0;

        for(int i=0;i<arr.length;i++){
            prefix=prefix+arr[i];

            if(prefix%2==0){
                result=result+odd;
                even++;
            }
            else{
                result=result+even;
                odd++;
            }
            result=result%mod;
        }
        return result;
    }
}