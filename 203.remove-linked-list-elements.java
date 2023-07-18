/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {

        // Kukla baş düğümü (dummy head node) oluşturulur.
        ListNode dummyHead = new ListNode(0);

        // Kukla başın next düğümü, listenin gerçek başına ayarlanır.
        dummyHead.next = head;

        // Önceki düğümü izlemek için prev işaretçisi tanımlanır.
        ListNode prev = dummyHead;

        // Listeyi yinelemek için curr işaretçesi tanımlanır.
        ListNode curr = head;


        while (curr != null) {

            //şimdiki düğümün değerinin hedef değere eşit olup olmadığı kontrol edilir
            if (curr.val == val) {
                //önceki düğümün next referansını şimdiki düğümden sonraki düğüme ayarlanır. (remove işlemi)
                prev.next = curr.next;
            } else {
                // prev işaretçisi mevcut düğüme taşınır.
                prev = curr;
            }
            // curr işaretçisi bir sonraki düğüme taşınır.
            curr = curr.next;
        }

        // dummyHead.next listenin yeni başı olarak döndürülür.
        return dummyHead.next;
 
    }
}
// @lc code=end

