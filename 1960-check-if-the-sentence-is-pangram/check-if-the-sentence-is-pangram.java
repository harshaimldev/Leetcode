class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alph = new int[26];
        for (int i=0; i<sentence.length(); i++){
            alph[sentence.charAt(i)-'a']+=1;
        }
        for(int i=0; i<alph.length; i++){
            if(alph[i]==0){
                return false;
            }
        }
        return true;
    }
}