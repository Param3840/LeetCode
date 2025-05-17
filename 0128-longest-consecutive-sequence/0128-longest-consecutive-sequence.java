class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>mp=new HashSet<>();
        for(int num : nums){
            mp.add(num);
        }
        int maxStreak=0;
        for(int num : mp){
            if(!mp.contains(num-1)){
                int currNum=num;
                int currStreak=1;
                while(mp.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
}