class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int right = nums.size();
        int min = Integer.MAX_VALUE;
        int j;

        for(int i =0;i<right;i++){
            int sum =0;
            for(j =i;j<right;j++){
                sum=sum+nums.get(j);

                int currLen = j-i+1;
                
               if(currLen >=l && currLen<=r){

                 if(sum>0){
                    min = Math.min(min,sum);
                }

                }

                if(currLen >= r) {
                    break;
                }

        }
        
        
    }
    return min ==Integer.MAX_VALUE?-1:min ;
    }
}