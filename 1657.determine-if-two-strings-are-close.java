/*
 * @lc app=leetcode id=1657 lang=java
 *
 * [1657] Determine if Two Strings Are Close
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
         if (word1.length() != word2.length()) {
            return false;
        }

        int[] same1 = new int[26];
        int[] same2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            same1[word1.charAt(i) - 'a']++;
            same2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((same1[i] == 0) != (same2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(same1);
        Arrays.sort(same2);

        for (int i = 0; i < 26; i++) {
            if (same1[i] != same2[i]) {
                return false;
            }
        }

        return true;
    }
    
}
// @lc code=end

