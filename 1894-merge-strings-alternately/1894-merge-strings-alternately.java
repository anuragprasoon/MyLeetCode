class Solution {
    public String mergeAlternately(String word1, String word2) {
        String finalstr = "";
        int i=0;
        for(; i<word1.length() && i<word2.length();i++){
                finalstr= finalstr + word1.charAt(i)+word2.charAt(i);

            }
        for (;i<word1.length();i++)
         finalstr= finalstr+word1.charAt(i);

        for (;i<word2.length();i++)
         finalstr= finalstr+word2.charAt(i);

        return finalstr ;
        
    }
}