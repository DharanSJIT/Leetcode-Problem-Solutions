class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();

        int left=0;
        int right=ch.length-1;

        while(left<right){
            char leftt=Character.toLowerCase(ch[left]);
            char rightt=Character.toLowerCase(ch[right]);

            boolean leftvowel = leftt == 'a' || leftt == 'e' || leftt == 'i' || leftt == 'o' || leftt == 'u';
            boolean rightvowel = rightt == 'a' || rightt == 'e' || rightt == 'i' || rightt == 'o' || rightt == 'u';

            if(leftvowel && rightvowel){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
            else if(!leftvowel){
                left++;
            }
            else{
                right--;
            }
        }
        return new String(ch);
    }
}