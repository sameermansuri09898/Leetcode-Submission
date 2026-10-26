
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] squares = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        long sum = 0;
        int n = nums.length;

        // for small number of arr
        for (int i = 0; i < n / 2; i++) {
            sum -= squares[i];
        }

        // for big number of arr
        for (int i = n / 2; i < n; i++) {
            sum += squares[i];
        }

        return sum;
    }
}
