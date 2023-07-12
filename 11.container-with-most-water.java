/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            int l1 = Math.min(height[start], height[end]);
            int l2 = end - start;
            int area =  l1 * l2;
            
            maxArea = Math.max(maxArea, area);
            // Pointerlar kontrol edilir
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
// @lc code=end

