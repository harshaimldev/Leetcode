class Solution {
    public int removeDuplicates(int[] nums) {
        int one=0, two = 1, count=0;
        while (two<nums.length){
            if (nums[one]==nums[two]){
                two+=1;
            }
            else{
                one+=1;
                nums[one]=nums[two];
                two+=1;
            }
            
        }
        return one+1;
    }
}