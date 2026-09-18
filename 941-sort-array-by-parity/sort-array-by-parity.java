class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0, j=1;
        while(j<nums.length){
            if (nums[i]%2!=0){
                if(nums[j]%2!=0){
                    j++;
                }
                else{
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j]=temp;
                }
            }
            else{
                i++;
                j++;
            }
        }
        return nums;

    }
}