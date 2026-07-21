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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode runner = head;
        while(current != null && current.next != null) {
            while(runner != null && runner.next != null) {
                if(current.val == runner.next.val) {
                    ListNode temp = runner.next;
                    runner.next = temp.next;
                    temp.next = null;
                }
                else{
                    runner = runner.next;
                }
                
            }
            
            current = current.next;
            runner = current;
        }
        return head;
    }
    
}