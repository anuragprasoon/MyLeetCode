class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charcount= new int[26];
        if(s.length()!=t.length()){ 
            return false;
        }
        for(char c: s.toCharArray()){
            charcount[c-'a']++;
        }
        for(char c: t.toCharArray()){
            charcount[c-'a']--;
            if (charcount[c-'a']<0){
                return false;
            }
        }
        for(int i: charcount){

        if(i!=0){ 
            return false;
        }
        }

        return true;

    }
}