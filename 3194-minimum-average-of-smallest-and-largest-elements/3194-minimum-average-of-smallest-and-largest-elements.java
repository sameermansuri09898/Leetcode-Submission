class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Double> list = new ArrayList<>();
        int left =0;
        int right=nums.length-1;
        double ans=Double.MAX_VALUE;

        while(left<right){
            double avg = (nums[left]+nums[right])/2.0;
            list.add(avg);
            left++;
            right--;
        }
        for(int i = 0;i<list.size();i++){
            ans = Math.min(ans,list.get(i));
        }
    return ans;    
    }
}