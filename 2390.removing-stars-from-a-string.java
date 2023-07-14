/*
 * @lc app=leetcode id=2390 lang=java
 *
 * [2390] Removing Stars From a String
 */

// @lc code=start
import java.util.Stack;
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
// @lc code=end

