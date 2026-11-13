class Solution {
    public int xorBeauty(int[] nums) {
        int ans = 0;
        // xor of hall array
        for(int num:nums){
            ans^=num;
        }
    return ans;    
    }
}