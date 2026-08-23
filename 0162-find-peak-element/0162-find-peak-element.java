class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(max==nums[i]) return i;
        }
        return -1;
    }
}