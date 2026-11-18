class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int grt_el[] = new int[nums.length];

        for(int i =2*nums.length-1;i>=0;i--){
            int idx =i%nums.length;
            while(!s.isEmpty() && nums[idx]>=nums[s.peek()]){
                s.pop();
            }

            if(i<nums.length){
                 if(s.isEmpty()){
                grt_el[idx] =-1; 
                }
                else{
                 grt_el[idx] = nums[s.peek()];
              }
            }
           
            s.push(idx);
        }

        
    return grt_el;    
    }
}