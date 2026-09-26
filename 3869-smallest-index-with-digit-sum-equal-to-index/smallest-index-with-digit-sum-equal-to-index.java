class Solution {
    public int smallestIndex(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++){
            int k=i;
            int n = nums[i];
            int sum =0;
            while(n>0){
                sum+=n%10;
                n = n/10;
            }
            if(sum==k){
                return k;
            }
        }
        return -1;
    }
}