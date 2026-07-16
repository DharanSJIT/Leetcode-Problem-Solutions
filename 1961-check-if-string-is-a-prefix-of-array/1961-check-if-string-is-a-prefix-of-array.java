class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++){
            res.append(words[i]);
            if(res.toString().equals(s)) return true;
            if(res.length()>s.length()) return false;
        }
        return false;
    }
}