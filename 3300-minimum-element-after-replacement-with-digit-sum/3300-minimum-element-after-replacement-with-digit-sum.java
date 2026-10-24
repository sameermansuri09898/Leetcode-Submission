class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int num:nums){
            int ans =0;
            while(num!=0){
                int digit = num%10;
                ans+=digit;
                num = num/10;
            }
            min = Math.min(ans,min);
        }
    return min;    
    }
}