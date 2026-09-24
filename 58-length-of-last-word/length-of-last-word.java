class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int l = words.length-1;
        if(words[l]== " "){
            l--;
        }
        return words[l].length();
        
    }
}