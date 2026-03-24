class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int count=0;
       int count1=0;
       for(int i=0;i<n;i++){
            count+=i;
            count1+=nums[i];
       }
       count+=n;
       return count-count1;
    }
}