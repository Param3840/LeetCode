class Solution {
      static boolean  canEatAll(int[] piles, int mid, int h){
        int actualHours=0;
        for (int i=0;i< piles.length;i++){

            actualHours+=piles[i]/mid;

            if (piles[i]%mid!=0){
                actualHours++;
            }
            if (actualHours>h) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
               int l=1;
        int r=Integer.MAX_VALUE;

        for (int i=0;i< piles.length;i++){
            if(r < piles[i]){
                r=piles[i];
            }
        }
        while (l<r){
            int mid=l+(r-l)/2;
            if (canEatAll(piles,mid,h)){
                r=mid;
            }
            else {
                l=mid+1;
            }
        }
        return l;
    }
}