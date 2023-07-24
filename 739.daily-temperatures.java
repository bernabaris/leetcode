/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            // yığın boş olana ve mevcut sıcaklık, yığının en üstündeki indeksteki sıcaklıktan daha büyük olana kadar
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int ix = stack.pop();
                result[ix] = i - ix;
            }
            stack.push(i);
        }
        
        return result;
    }
}
// @lc code=end

