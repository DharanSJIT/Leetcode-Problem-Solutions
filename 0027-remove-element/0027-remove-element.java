class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int num : nums){
            res.add(num);
        }
        for(int i=0;i<res.size();i++){
            if(res.get(i)==val){
                res.remove(i);
                i--;
            }
        }
        for(int i = 0; i < res.size(); i++){
            nums[i] = res.get(i);
        }
        return res.size();
    }
}