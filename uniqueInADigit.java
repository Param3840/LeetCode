import java.util.HashSet;

public class uniqueInADigit {
    public static int count(int n){
        int count=0;
        int limit=(int)Math.pow(10,n);
        for (int i=0;i<limit;i++){
            if (hasUnique(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean hasUnique(int n){
        HashSet<Character> set=new HashSet<>();
        String str=String.valueOf(n);
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }
    public static void main(String[] args) {
        int n =2;
        System.out.println(count(n));
    }
}