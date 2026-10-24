class Solution {
    public int getLucky(String s, int k) {
        int sum =0;

        for(int i = 0;i<s.length();i++){
            int num = s.charAt(i) -'a'+1;

            while(num!=0){
            int digit = num%10;
            sum+=digit;
            num/=10;
            }

        }
        // break until k ==0 
        for(int i = 1;i<k;i++){
            int temp =0;
            while(sum!=0){
                temp+=sum%10;
                sum/=10;
            }
            sum = temp;
        }
        
        
    return sum;    

    }
}