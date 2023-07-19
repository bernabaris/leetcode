/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Recursive ile listenin sonuna ulaşıp ve ters çevrilmiş listenin başı alınır.
        ListNode reversedListHead = reverseList(head.next);
        // Listenin ters çevrilmesi sırasında her düğümün 'next' özelliğini kendisinden önceki düğüme işaret eder şekilde ayarlanır.
        head.next.next = head;
        // İlk düğüm artık listenin sonu olduğundan onun 'next' özelliğini 'null' olarak ayarlanır.
        head.next = null;
        // Ters çevrilmiş listenin başını döndürür.
        return reversedListHead;
    

    }
}
// @lc code=end

