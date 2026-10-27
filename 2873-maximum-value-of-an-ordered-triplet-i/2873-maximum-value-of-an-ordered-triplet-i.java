
class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxValue = 0;
        long maxDiff = 0;
        long maxNum = 0;

        for (int num : nums) {
            maxValue = Math.max(maxValue, maxDiff * num);
            maxDiff = Math.max(maxDiff, maxNum - num);
            maxNum = Math.max(maxNum, num);
        }

        return maxValue;
    }
}
