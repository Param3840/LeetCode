class Solution {
    public List<String> buildArray(int[] target, int n) {
        int targetSize= target.length;
        int stream=1;
        int i=0;
        List<String> ans=new ArrayList<>();
        while (i<targetSize && stream<=n){
            ans.add("Push");
            if(stream==target[i]){
                i++;
            }
            else{
                ans.add("Pop");
            }
            stream++;
        }
        return ans;
    }
}