/*
 * @lc app=leetcode id=1493 lang=java
 *
 * [1493] Longest Subarray of 1's After Deleting One Element
 */

// @lc code=start
class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            // Birden fazla sıfır var ise sola kaydırarak kontrol edilir.
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            // 
            max = Math.max(max, right - left);
        }
        return max;
        
    }
}
// @lc code=end

