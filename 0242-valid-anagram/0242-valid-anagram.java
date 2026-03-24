class Solution {
    public boolean isAnagram(String s, String t) {
      int n1=s.length();
      int n2=t.length();
      char[] ch1=s.toCharArray();
      Arrays.sort(ch1);
      char[] ch2=t.toCharArray();
      Arrays.sort(ch2);
      if(Arrays.equals(ch1,ch2)){
        return true;
      }
      return false;
    }
}