class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();

        for(int i =0;i<nums.length;i++){
            if((i==0 || nums[i]-nums[i-1]>1) && (i==nums.length-1 || nums[i+1]-nums[i]>1)){
                ans.add(nums[i]);
            }
        }
    return ans;    
    }
}