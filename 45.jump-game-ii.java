/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0; 
        }
        
        int maxPosition = nums[0], nextMaxPosition = nums[0];
        int jumps = 1;
        
        for (int i = 0; i < n; i++) {
            //Geçerli konum, geçerli atlama ile ulaşılabilen en uzak konumdan
            //daha büyükse, bir sonraki atlama ile ulaşılabilen en uzak 
            // konuma atlanır.
            if (i > maxPosition) {
                maxPosition = nextMaxPosition;
                jumps++;
            }
            
            // Diğer atlamada ulaşılabilecek pos belirlenir.
            nextMaxPosition = Math.max(nextMaxPosition, i + nums[i]);
            
            // Eğer max bulunduysa başka jump'a gerek kalmadan bitirilir.
            if (maxPosition >= n - 1) {
                break;
            }
        }
        return jumps;   
    }
}
// @lc code=end

