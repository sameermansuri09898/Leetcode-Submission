class Solution {
    public int removeDuplicates(int[] nums) {
       int leftptr = 0;
       for(int i =0;i<nums.length;i++){
        if(nums[leftptr]!= nums[i]){
            nums[leftptr+1] = nums[i];
            leftptr++;
        }
       } 
       return leftptr+1;
    }
}