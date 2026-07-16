class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        ArrayList<Integer> res=new ArrayList<>();
        int[][] dummy=new int[n+2][m+2];
        for(int i=0;i<n+2;i++){
            for(int j=0;j<m+2;j++){
                dummy[i][j]=-1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dummy[i+1][j+1]=mat[i][j];
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                int temp=dummy[i][j];
                if(temp>dummy[i+1][j] && temp>dummy[i-1][j] &&
                temp>dummy[i][j-1]&&
                temp>dummy[i][j+1]){
                    res.add(i-1);
                    res.add(j-1);
                    break;
                }
            }
        }
        int[] ans=new int[2];
        int i=0;
        for(int num : res){
            ans[0]=res.get(0);
            ans[1]=res.get(1);
        }
        return ans;
    }
}