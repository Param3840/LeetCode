class Solution {
    public List<List<String>> partition(String s) {
        List<List<String >> res=new ArrayList<>();
        List<String> ls=new ArrayList<>();
        function(0,s,new ArrayList<>(),res);
        return res;
    }
     public static void function(int index,String s,List<String> ls,List<List<String>> res){
        if (index==s.length()){
            res.add(new ArrayList<>(ls));
            return;
        }
        for (int i=index;i<s.length();i++){
            if (isPali(s,index,i)){
                ls.add(s.substring(index,i+1));
                function(i+1,s,ls,res);
                ls.remove(ls.size()-1);
            }
        }
    }
    public static boolean isPali(String s,int left,int right){
        while (left<=right){
            if (s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}