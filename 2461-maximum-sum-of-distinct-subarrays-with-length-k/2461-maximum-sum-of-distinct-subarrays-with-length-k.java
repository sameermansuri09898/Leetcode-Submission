class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        long window =0;
        long ans = Integer.MIN_VALUE;
        int left =0;

        for(int i =0;i<nums.length;i++){

            // remove duplicate from hashset and window 
            while(set.contains(nums[i])){
                set.remove(nums[left]);
                window-=nums[left];
                left++;
            }
            // add element into window and hashst
            set.add(nums[i]);
            window+=nums[i];

            // check current window length;
            if(i-left+1>k){
                set.remove(nums[left]);
                window-=nums[left];
                left++;
            }

            if(i-left+1==k){
                ans =Math.max(ans,window);
            }


        }
    return ans==Integer.MIN_VALUE?0:ans;    
    }
}