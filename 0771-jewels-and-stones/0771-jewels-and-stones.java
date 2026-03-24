class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] str1=jewels.toCharArray();
        char[] str2=stones.toCharArray();
        int count=0;
        for(int i=0;i<str1.length;i++){
            for(int j=0;j<str2.length;j++){
                if(str1[i]==str2[j]){
                    count++;
                }
            }
        }
        return count;
    }
}