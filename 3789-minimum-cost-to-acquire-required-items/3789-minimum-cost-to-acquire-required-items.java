class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
    
        // Buy individual items
        long price1 = (long) cost1 * need1 + (long) cost2 * need2;

        // Buy only type 3 items
        long price2 = (long) Math.max(need1, need2) * costBoth;

        // Mix of type 3 and individual items min ke liye mul easy
        int both = Math.min(need1, need2);

        int rem1 = need1-both;
        int rem2 = need2-both;

        long price3 = (long) costBoth*both + (long) rem1*cost1 + (long) rem2*cost2;
        return Math.min(price1,Math.min(price2,price3));







    }
}