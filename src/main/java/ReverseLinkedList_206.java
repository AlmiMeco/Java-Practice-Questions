public class ReverseLinkedList_206 {

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

    /**
     Given the head of a singly linked list, reverse the list, and return the reversed list.
     **/


    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode prev = null;

        while (current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;



    }


}
