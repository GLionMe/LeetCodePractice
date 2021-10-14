//  Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode node1 = null;
        ListNode node2 = head;
        ListNode node3 = null;
        
        if(head == null || head.next == null)
            return head;
        
        node3 = node2.next;
        
        while(node2.next != null) {
            node2.next = node1;
            node1 = node2;
            node2 = node3;
            node3 = node2.next;
        }
        
        node2.next = node1;
        return node2;
    }

    public static void main(String[] args) {
        ListNode head = null;
        ListNode first = null;
        ListNode second = null;
        ListNode third = null;

        head = new ListNode(5, first);
        first = new ListNode(6, second);
        second = new ListNode(7,third);
        third = new ListNode(8, null);

        System.out.println("Before Reversing the Linked List");
        ListNode temp1 = head;
        while(temp1 != null) {
            System.out.println(temp1.val);
            temp1 = temp1.next;
        }

        System.out.println("After reversing the linked list");
        head = reverseList(head);
        ListNode temp = head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}