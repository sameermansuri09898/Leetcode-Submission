class Solution {
    public boolean isThree(int n) {
        int totaldivisor=0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                totaldivisor++;
            }
        }

    return totaldivisor ==3?true:false;   
    }
}