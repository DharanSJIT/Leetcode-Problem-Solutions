class Solution {
    public int countPairs(List<Integer> nums, int target) {
       int n=nums.size();
       int count=0;
       for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            int val1=nums.get(j);
            int val2=nums.get(i);
            if(val1+val2 < target) count++;
        }
       } 
       return count;
    }
}