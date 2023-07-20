/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
 */

// @lc code=start

import java.util.List;

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
    public ListNode oddEvenList(ListNode head) {

        // Boş liste durumunu kontrol edilir.
        if (head == null) 
            return null;
        
        // Tek ve çift düğümler için iki pointer oluşturulur.
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
        // Listeyi tarayarak düğümleri ilgili listelere yerleştirilir.
        while (even != null && even.next != null) {
            // Tek düğümler güncellenir.
            odd.next = even.next;
            odd = odd.next;
            // Çift düğümler güncellenir.
            even.next = odd.next;
            even = even.next;
        }
        
        // Tek ve çift listeler birleştirilir.
        odd.next = evenHead;
        
        // Liste döndürülür.
        return head;
    }
}
// @lc code=end

