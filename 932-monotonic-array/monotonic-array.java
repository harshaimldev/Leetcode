class Solution {
    public boolean isMonotonic(int[] nums) {
        int i=0;
        if(nums.length==1){
            return true;
        }
        while(nums[i]==nums[i+1]){
            i++;
            if(i==nums.length-1){
                return true;
            }
        }
        if(nums[i]<=nums[i+1]){
            i++;
            while(i<nums.length-1){
                if(nums[i]<=nums[i+1]){
                    i++;
                }
                else{
                    return false;
                }
            }
        }
        else{
            i++;
            while(i<nums.length-1){
                if(nums[i]>=nums[i+1]){
                    i++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}