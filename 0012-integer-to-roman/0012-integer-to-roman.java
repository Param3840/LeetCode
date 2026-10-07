class Solution {
    public String intToRoman(int num) {
         int[] values = {
                1000, 900, 500, 400,
                100, 90, 50, 40,
                10, 9, 5, 4, 1
        };
        String[] symbols = {
                "M", "CM", "D", "CD",
                "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"
        };
        StringBuilder st=new StringBuilder();
        int divide=0;
        int rem=0;
        for (int i=0;i< values.length;i++){
            if (num>=values[i]){
                divide=num/values[i];
                rem=num%values[i];
                for (int k=0;k<divide;k++){
                    st.append(symbols[i]);
                }
                num= rem;
            }
        }
        return st.toString();
    }
}