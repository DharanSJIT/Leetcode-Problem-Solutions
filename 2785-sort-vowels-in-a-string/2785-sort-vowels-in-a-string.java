class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        List<Character> vowels=new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(isvowel(ch)){
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);
        char[] result=s.toCharArray();
        int idx=0;

        for(int i=0;i<n;i++){
            if(isvowel(result[i])){
                result[i]=vowels.get(idx);
                idx++;
            }
        }
        return new String(result);
    }
    private boolean isvowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}