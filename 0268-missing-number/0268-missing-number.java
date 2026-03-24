class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int count=0;
       int count1=0;
       for(int i=0;i<n+1;i++){
            count+=i;
       }
       for(int i=0;i<n;i++){
           count1+=nums[i];
       }
       return count-count1;
    }
}