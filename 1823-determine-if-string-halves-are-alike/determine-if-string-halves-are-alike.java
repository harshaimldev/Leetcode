class Solution {
    public boolean halvesAreAlike(String s) {
        int left=0;
        int right=s.length()-1;
        int lc=0, rc=0;
        while(left<right){
            if ("aAeEiIoOuU".indexOf(s.charAt(left)) != -1){
                lc++;
            }
            if("aAeEiIoOuU".indexOf(s.charAt(right)) != -1){
                rc++;
            }
                left++;
                right--;
    
            }
            if(lc==rc){
                return true;
            }
            return false;
            
        }
    }
