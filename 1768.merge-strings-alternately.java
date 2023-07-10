/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start


class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            merged += word1.charAt(i++);
            merged += word2.charAt(j++);
        }
        
        // If word1 is longer, append the rest of word1
        while (i < word1.length()) {
            merged += word1.charAt(i++);
        }
        
        // If word2 is longer, append the rest of word2
        while (j < word2.length()) {
            merged += word2.charAt(j++);
        }
        
        return merged;
    }
}

// @lc code=end

