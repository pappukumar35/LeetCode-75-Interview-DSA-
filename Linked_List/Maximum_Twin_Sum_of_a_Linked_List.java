package Linked_List;

public class Maximum_Twin_Sum_of_a_Linked_List {

     public class ListNode {
          int val;
          ListNode next;

          ListNode() {
          }

          ListNode(int val) {
               this.val = val;
          }

          ListNode(int val, ListNode next) {
               this.val = val;
               this.next = next;
          }
     }

     public int pairSum(ListNode head) {
          ListNode slow = head;
          ListNode fast = head;
          int maxVal = 0;

          while (fast != null && fast.next != null) {
               slow = slow.next;
               fast = fast.next.next;
          }

          ListNode nextNode, prev = null;
          while (slow != null) {
               nextNode = slow.next;
               slow.next = prev;
               prev = slow;
               slow = nextNode;
          }

          while (prev != null) {
               maxVal = Math.max(maxVal, head.val + prev.val);
               prev = prev.next;
               head = head.next;
          }

          return maxVal;
     }

     public static void main(String[] args) {

     }
}
