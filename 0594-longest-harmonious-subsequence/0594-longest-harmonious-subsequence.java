import java.util.Arrays;

class Solution {
    public int findLHS(int[] nums) {
        int left = 0;
        int ans = 0;
        Arrays.sort(nums);

        for(int right = 0; right<nums.length;right++){
            while(nums[right]-nums[left] >1){
                left++;
            }
            if(nums[right]-nums[left] == 1){
                ans = Math.max(ans,right-left+1);
            }
        }
     return ans;   
    }
}