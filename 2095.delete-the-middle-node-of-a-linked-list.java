/*
 * @lc app=leetcode id=2095 lang=java
 *
 * [2095] Delete the Middle Node of a Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Eğer liste boş ya da tek elemanlı ise null döndürülür.
        if(head==null || head.next ==null){
            return null;
        }

        ListNode node = head;
        int size = 0;
        
        while (node != null) {
            node = node.next;
            size++;
        }

        node = head;
        int target = size / 2;

        // Ortanca düğümün bir öncesini bulur
        for (int i = 0; i < target - 1; i++) {
            node = node.next;
        }
        
        // Ortanca düğümü çıkarır
        node.next = node.next.next;

        return head;
    }
}
// @lc code=end

