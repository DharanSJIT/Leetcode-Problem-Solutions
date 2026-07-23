class Solution {
    public int findMaxK(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums){
            set.add(num);
        }   
        List<Integer> lst=new ArrayList<>(set);
        Collections.sort(lst);
        for(int i=lst.size()-1;i>0;i--){
            int val=lst.get(i);
            if(lst.contains(val) && lst.contains(-val)){
                return val;
            }
        }
        return -1;
    }
}