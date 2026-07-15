class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch=s.toCharArray();
        char[] ans=new char[ch.length];
        for(int i=0;i<ch.length;i++){
            ans[indices[i]]=ch[i];
        }
        return new String(ans);
    }
}