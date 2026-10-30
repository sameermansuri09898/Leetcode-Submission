class Solution {
    public double myPow(double x, int n) {
    
        if(x==0) return 0.0;
        if(n==0) return 1.0;
        if(x==1) return 1.0;
        if(x==-1 && n%2==0) return 1.0;
        if(x==-1 && n%2!=0) return -1.0;

        long binaryForm = n;
        

        // tackle negative value of x and n
        if(n<0){
            x = 1/x;
            binaryForm = -binaryForm;
            
        }
        double ans = 1;

        while(binaryForm>0){
            // lsb check
            if((binaryForm & 1)!=0){
                ans*=x;
            }
            x*=x;
            // left shift
            binaryForm = (binaryForm >> 1);
        }
    return ans;    
    }
}