/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length()==0){
            return s;
        }

        char[] chars = s.toCharArray();

        int left = 0;
        int right= s.length() - 1;

        while(left < right){
            while(left < right && !isVowel(chars[left])){
                left++;
            }
            while(left < right && !isVowel(chars[right])){
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }    

    private static Boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
// @lc code=end

