class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int i = 0, j = 1;
        while (i < nums.length) {
            if (i % 2 == 0 && nums[i] % 2 != 0) {
                j = i + 1;
                while (j < nums.length && nums[j] % 2 != 0) {
                    j++;
                }
                if (j < nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            else if (i % 2 != 0 && nums[i] % 2 == 0) {
                j = i + 1;
                while (j < nums.length && nums[j] % 2 == 0) {
                    j++;
                }
                if (j < nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            i++;
        }

        return nums;
    }
}