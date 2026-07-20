class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int[] res=new int[n];
        int temp=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr1[j]==arr2[i]){
                    res[temp]=arr1[j];
                    temp++;
                    arr1[j]=-1;
                }
            }
        }
        List<Integer> extra=new ArrayList<>();
        for(int num : arr1){
            if(num!=-1){
                extra.add(num);
            }
        }
        Collections.sort(extra);
        for(int num : extra){
            res[temp++]=num;
        }
        return res;
    }
}