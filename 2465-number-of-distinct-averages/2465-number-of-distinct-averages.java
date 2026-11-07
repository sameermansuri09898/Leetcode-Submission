class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double> set = new HashSet<>();
        int left =0;
        int right =nums.length-1;
        while(left<right){
            int max = nums[right];
            int min = nums[left];

            // calculate the avg = 
            double avg = (max+min)/2.0;
            set.add(avg);
            left++;
            right--;
            
        }
    return set.size();    
    }
}