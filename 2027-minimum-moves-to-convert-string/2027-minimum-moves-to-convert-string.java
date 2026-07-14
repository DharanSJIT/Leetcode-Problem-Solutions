class Solution {
    public int minimumMoves(String s) {
        int n=s.length();
        int moves=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='X'){
                moves++;
                i+=2;
            }
        }
        return moves;
    }
}