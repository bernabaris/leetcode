/*
 * @lc app=leetcode id=2215 lang=java
 *
 * [2215] Find the Difference of Two Arrays
 */

// @lc code=start

import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        // Set1'de bulunan ancak set2'de olmayan elemanlar alınır
        Set<Integer> unique1 = new HashSet<>(set1);
        unique1.removeAll(set2);

        // Set2'de bulunan ancak set1'de olmayan elemanlar alınır
        Set<Integer> unique2 = new HashSet<>(set2);
        unique2.removeAll(set1);

        // Setler listeye donusturulur
        return Arrays.asList(new ArrayList<>(unique1),new ArrayList<>(unique2));
    }
}
// @lc code=end

