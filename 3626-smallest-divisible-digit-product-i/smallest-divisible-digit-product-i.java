class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int temp = n;
            int num = 1;

            while (temp > 0) {
                num *= temp % 10;
                temp /= 10;
            }
            if (num%t==0){
                break;
            }
            else{
                n++;
            }
        }
        return n;
    }
}