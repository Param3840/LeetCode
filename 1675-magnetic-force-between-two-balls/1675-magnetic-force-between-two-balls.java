class Solution {
     public int maxDistance(int[] position, int m) {
                Arrays.sort(position);
                        int n= position.length;
                                int low=0,high=position[n-1]-position[0];

                                        while (low<=high){
                                                    int mid=low+(high-low)/2;
                                                                if (!canWePlace(position,mid,m)){
                                                                                high=mid-1;
                                                                                            }
                                                                                                        else {
                                                                                                                        low=mid+1;
                                                                                                                                    }
                                                                                                                                            }
                                                                                                                                                    return high;
                                                                                                                                                        }
                                                                                                                                                            public static boolean canWePlace(int[] stalls,int dist,int cows){
                                                                                                                                                                    int countCows=1;
                                                                                                                                                                            int last=stalls[0];

                                                                                                                                                                                    for (int i=1;i<stalls.length;i++){
                                                                                                                                                                                                if (stalls[i]-last>=dist){
                                                                                                                                                                                                                countCows++;
                                                                                                                                                                                                                                last=stalls[i];
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                            if (countCows>=cows) return true;
                                                                                                                                                                                                                                                                    else return false;
                                                                                                                                                                                                                                                                        }
     }
        
    
