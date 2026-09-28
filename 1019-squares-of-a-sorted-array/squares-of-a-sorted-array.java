class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            temp[i]= nums[i]*nums[i];
        }
        for (int i=0; i<temp.length; i++){
            for(int j=0; j<temp.length-i-1; j++){
                if(temp[j]>temp[j+1]){
                    int temp1 = temp[j];
                    temp[j]=temp[j+1];
                    temp[j+1]=temp1;
                }
            }
        }
        return temp;
    }
}
