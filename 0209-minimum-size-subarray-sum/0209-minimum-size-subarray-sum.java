class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int window =0;
        int l =0;
        int ans = Integer.MAX_VALUE;

        for(int i =0;i<nums.length;i++){
            window+=nums[i];

            while(window>=target){
            int current_length = i-l+1;
            ans =Math.min(ans,current_length);
            window-=nums[l++];
            }
        }
    return ans == Integer.MAX_VALUE?0:ans;    
    }
}