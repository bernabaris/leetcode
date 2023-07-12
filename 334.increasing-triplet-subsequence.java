/*
 * @lc app=leetcode id=334 lang=java
 *
 * [334] Increasing Triplet Subsequence
 */

// @lc code=start
class Solution {
    public boolean increasingTriplet(int[] nums) {
         if (nums.length < 3) {
            return false;
        }

        //İlk iki element için small-big atanır
        int small = nums[0];
        int big = nums[1];

        // Sırasıyla kontrol edilerek ilk artış yeri bulunur.
        if (small >= big) {
            int i = 1;
            while (i < nums.length - 1 && nums[i] >= nums[i + 1]) {
                i++;
            }
            // Artış bulunmazsa
            if (i == nums.length - 1) {
                return false;
            }
            small = nums[i];
            big = nums[i + 1];
        }

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > big) {
                return true;
            } else if (nums[i] <= small) {
                small = nums[i];
            } else if (nums[i] <= big) {
                big = nums[i];
            }
        }

        return false;
    }
}
// @lc code=end

