class Solution {
    public String toLowerCase(String s) {
        String str="";
        for(char c: s.toCharArray()){
            if(c>='A' && c<='Z'){
                c+=32;
            }
            str+=String.valueOf(c);
        }
        return str;
    }
}