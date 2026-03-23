class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int n1=nums2.length;
        int[] res=new int[n+n1];
        System.arraycopy(nums1,0,res,0,n);
        System.arraycopy(nums2,0,res,n,n1);
        Arrays.sort(res);
        if(res.length%2!=0){
            return res[res.length/2];
        }
        return (res[(res.length/2)]+res[(res.length/2-1)])/2.0;
    }
}