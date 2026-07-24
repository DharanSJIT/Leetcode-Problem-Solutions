class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            else if(nums[i]>max){
                max=nums[i];
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums) set.add(num);
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}