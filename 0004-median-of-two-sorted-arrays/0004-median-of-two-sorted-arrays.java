class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n = nums2.length;
        int [] ans = new int[m+n];

        int i = 0;
        int j = 0;
        int index =0;

        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                ans[index] = nums1[i++];
            }
            else{
                ans[index] = nums2[j++];
            }
            index++;
        }
        while(i<m){
            ans[index++] = nums1[i++];
        }
        while(j<n){
            ans[index++] = nums2[j++];
        }

        int total = ans.length;
        int mid = total/2;
        if(total%2!=0){
            return ans[mid];
        }
        else{
            return (ans[mid-1]+ans[mid])/2.0;
        }
 
    }
}