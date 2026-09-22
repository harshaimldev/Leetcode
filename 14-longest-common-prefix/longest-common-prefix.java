class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        int j = 0;
        if (strs.length==1){
            return strs[0];
        }
        while (j < strs.length - 1) {
            if (i >= strs[j].length() || i >= strs[j + 1].length()) {
                break;
            }
            if (strs[j].charAt(i) == strs[j + 1].charAt(i)) {
                j++;
                if (j == strs.length - 1) {
                    j = 0;
                    i++;
                }
            } 
            else {
                break;
            }
        }
        return strs[0].substring(0, i);
    }
}