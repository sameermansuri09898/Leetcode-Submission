class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int next_grt2 [] = new int[nums2.length];
        int next_grt1 [] = new int[nums1.length];

        for(int i =nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && nums2[i]>=nums2[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                next_grt2[i] = -1;
            }
            else{
                next_grt2[i] = nums2[s.peek()];
            }

            s.push(i);
        }
        
        // compare value with num1 and num2

        for(int i = 0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    next_grt1[i] = next_grt2[j];
                }
            }
        }
        
    return next_grt1;    
    }
}