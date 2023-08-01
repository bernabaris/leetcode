/*
 * @lc app=leetcode id=1431 lang=java
 *
 * [1431] Kids With the Greatest Number of Candies
 */

// @lc code=start

import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        List<Boolean> result = new ArrayList<>();

        for(int candy =0; candy<candies.length; candy++){
            if(candies[candy] > maxCandy){
                maxCandy = candies[candy];
            }
        }

        for(int candy =0; candy<candies.length; candy++){
            if(candies[candy] + extraCandies >= maxCandy){
                result.add(true);
            }else{
                result.add(false);
            }
        }

        return result;
    }
}
// @lc code=end

