class Solution {
    public int pivotIndex(int[] nums) {
        int left =0;
        int right =0;
        int totl = 0;

        for(int num:nums){
            totl+=num;
        }

        for(int i =0;i<nums.length;i++){
            right = totl-left-nums[i];
            if(left==right){
                return i;
            }
            else{
                left+=nums[i];
            }
        }
    return -1;    
    }
}