/*
 * @lc app=leetcode id=649 lang=java
 *
 * [649] Dota2 Senate
 */

// @lc code=start
import java.util.*;
class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();
            // İlk gelen senatörün sonrakini yasaklama hakkı
            if (r < d) {
                radiant.offer(r + n);
            } else {
                dire.offer(d + n);
            }
        }
        
        return (radiant.isEmpty()) ? "Dire" : "Radiant";
    }
}
// @lc code=end

