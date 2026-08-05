class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i =0;
        while(i<nums.length){
            if (nums.length==1){
                return nums[0];
            }
            if (i==nums.length-1){
                return nums[i];
            }
            if (nums[i]==nums[i+1]){
                i+=2;
            }
            else{
                return nums[i];
            }
        }
        return 1;
    }
}