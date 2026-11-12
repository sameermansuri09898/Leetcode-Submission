class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int window =0;
        int left = 0;
        int n = nums.length;
        int ans  =Integer.MAX_VALUE;;

        for(int right=0; right<n; right++){

            // expand window
            window+=nums[right];

            // shrink window
            while(window>=target){
                int len_sub = right-left+1;// len of current sub array
                ans=Math.min(ans,len_sub);

                window-=nums[left++];

            }
        }
    return ans == Integer.MAX_VALUE?0:ans;    
    }
}