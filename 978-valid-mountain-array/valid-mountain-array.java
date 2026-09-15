class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        if (arr.length<3){
            return false;
        }
        for (int j=1; j<arr.length; j++){
            if(arr[i]<arr[j]){
                i++;
            }
            else{
                break;
            }
        }
        if (i==arr.length-1 || i==0){
            return false;
        }
        int j =i+1;
        while(i<arr.length-1){
            if (arr[i]>arr[j]){
                i++;
                j++;
            }
            else{
                break; 
            }
        }
        if (i==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}