class Solution {
    public int lengthOfLastWord(String s) {
    String word="";
    String regex = "[,\\.\\s ]";
    String[] myArray = s.split(regex);
    for (String i : myArray) {
	    word=i;
    }
    return word.length();
    }
}