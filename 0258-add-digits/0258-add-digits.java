class Solution {
    public int addDigits(int num) {
        int sumnum =num;

        while(sumnum>9){
            int sum = 0;
            while(sumnum!=0){
                sum+=sumnum%10;
                sumnum/=10;
            }
            sumnum = sum;
        }
    return sumnum;    
    }
}