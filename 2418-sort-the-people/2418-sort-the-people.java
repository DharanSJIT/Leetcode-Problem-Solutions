class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        String[] ans=new String[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(heights[i],i);
        }
        Arrays.sort(heights);
        int idx=0;
        for(int i=n-1;i>=0;i--){
            int orgidx=map.get(heights[i]);
            ans[idx++]=names[orgidx];
        }
        return ans;
    }
}