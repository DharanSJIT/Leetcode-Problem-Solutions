class Solution {
    public void duplicateZeros(int[] arr) {
        int temp=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                ans.add(arr[i]);
                ans.add(0);
            }
            else if(arr[i]!=0){
                ans.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans.get(i);
        }
    }
}