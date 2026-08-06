class Solution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1, result=0,curr=0;
        while(l<r){
            if (height[l]<height[r]){
                curr = height[l]*(r-l);
                if(result< curr){
                    result=curr;
                }
                l++;
            }
            else{
                curr = height[r]* (r-l);
                if(result< curr){
                    result=curr;
                }
                r--;
            }
        }
        return result;
    }
}