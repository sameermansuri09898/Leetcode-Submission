class Solution {
    public int maxArea(int[] height) {
        int mostwater = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int w = right-left;// last index - oth index
            int ht = Math.min(height[left],height[right]);
            int currentwater = ht*w;
            mostwater = Math.max(mostwater,currentwater);

            if (height[left] < height[right]){
                  left++;
             }
             else right--;
        } 
        return mostwater;
    }
}