/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode curr = head;
        ListNode next = curr.next;
        
        while(next!=null){
            if(curr.val == next.val){
                next = next.next;
                curr.next = null;
            } else{
                curr.next = next;
                curr = next;
                next = next.next;
            }  
        }
        
        return head;
        
    }
}
