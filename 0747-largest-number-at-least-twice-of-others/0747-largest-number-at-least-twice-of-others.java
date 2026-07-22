class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        int largest=temp[n-1];
        int seclar=temp[n-2];
        if(seclar*2 <= largest){
            for(int i=0;i<n;i++){
                if(largest==nums[i]){
                    return i;
                }
            }
        }
        return -1;
    }
}