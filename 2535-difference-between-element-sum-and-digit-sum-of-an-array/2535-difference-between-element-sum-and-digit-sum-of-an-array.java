class Solution {
    public int differenceOfSum(int[] nums) {
        int sum_el=0;
        int sum_digit = 0;

        for(int i=0;i<nums.length;i++){
            sum_el+=nums[i];
            int digit = nums[i];
            while(digit!=0){
                sum_digit+=digit%10;
                digit/=10;
            }
        }
    return  Math.abs(sum_el-sum_digit);   
    }
}