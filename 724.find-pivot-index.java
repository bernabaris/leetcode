/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int num: nums){
            totalSum +=num;
        }

        int runSum = 0;
        for(int i = 0; i < nums.length; i++ ){
            if (runSum == totalSum - runSum - nums[i]){
                return i;
            }

            runSum += nums[i];
        }
        return -1;
    }
}
// @lc code=end

