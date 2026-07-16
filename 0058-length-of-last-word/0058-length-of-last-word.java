class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.trim().split("\\s+");
        int n=words.length;
        char[] ch=words[n-1].toCharArray();
        return ch.length;
    }
}