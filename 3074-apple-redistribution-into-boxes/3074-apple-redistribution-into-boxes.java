class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n=apple.length;
        int m=capacity.length;
        Arrays.sort(capacity);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=apple[i];
        }
        int count=1;
        int cc=capacity[m-1];
        for(int i=m-1;i>0;i--){
            if(cc>=sum){
                return count;
            }
            else{
                count++;
                cc+=capacity[i-1];
                System.out.println(cc);
            }
        }
        return count;
    }
}