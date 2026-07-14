class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}