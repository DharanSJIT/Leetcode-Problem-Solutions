class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        set.add(new ArrayList<>());
        for(int num : nums){
            List<List<Integer>> curr=new ArrayList<>(set);
            for(List<Integer> subset : curr){
                List<Integer> temp=new ArrayList<>(subset);
                temp.add(num);
                set.add(temp);
            }
        }
        return new ArrayList<>(set);
    }
}