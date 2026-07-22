class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        int pos=nums.length/3;
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue()>pos){
                ans.add(entry.getKey());
            }
        }
        return ans;
          
    }
}