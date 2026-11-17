class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
         ArrayList<Integer> ans = new ArrayList<>();
         String str = String.valueOf(k);

         int i =num.length-1;
         int j = str.length()-1;
         int carry =0;
         

         while(i>=0 || j>=0 || carry>0){
            int d1 =0;
            int d2 =0;

            if(i>=0){
                d1 = num[i];
                i--;
            }
            if(j>=0){
                d2 = str.charAt(j) -'0';
                j--;
            }

            int sum = d1+d2+carry;
            int digit = sum%10;
            carry = sum/10;
            ans.add(digit);



         }

    Collections.reverse(ans);

    return ans;     
    }
}