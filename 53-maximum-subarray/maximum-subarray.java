class Solution {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int sum = 0;
        int sum1 = nums[0];

        while (i < nums.length) {
            sum += nums[i];

            if (sum > sum1) {
                sum1 = sum;
            }

            if (sum < 0) {
                sum = 0;
            }

            i++;
        }

        return sum1;
    }
}