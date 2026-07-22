class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] ranks=new String[score.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(score[i],i);
        }
        Arrays.sort(score);
        int rank=1;
        for(int i=n-1;i>=0;i--){
            int index=map.get(score[i]);
            if(rank==1){
                ranks[index]="Gold Medal";
            }
            else if(rank==2){
                ranks[index]="Silver Medal";
            }
            else if(rank==3){
                ranks[index]="Bronze Medal";
            }
            else{
                ranks[index]=String.valueOf(rank);
            }
            rank++;
        }
        return ranks;
    }
}